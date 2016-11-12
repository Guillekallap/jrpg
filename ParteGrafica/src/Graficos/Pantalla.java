package Graficos;

public class Pantalla {

	public static final int MAP_WIDTH = 64;
	public static final int MAP_WIDTH_MASK = MAP_WIDTH -1;
	
	public int[]pixels;
	
	//public int[] tiles =new int[MAP_WIDTH*MAP_WIDTH];
	//public int[] colores =new int[MAP_WIDTH*MAP_WIDTH*4];
	
	public int xOffset = 0;//lo de la camara
	public int yOffset=0;
	
	public int width;
	public int height;
	
	public SpriteSheet sheet;
	
	public Pantalla(int width,int height, SpriteSheet sheet){
		this.width=width;
		this.height=height;
		this.sheet = sheet;
		
		pixels = new int[width*height];
		
		/*for(int i= 0;i<MAP_WIDTH*MAP_WIDTH;i++){//setea q color corresponde a que
			colores[i*4+0]=0xff00ff;
			colores[i*4+1]=0x00ffff;
			colores[i*4+2]=0xffff00;
			colores[i*4+3]=0xffffff;
			
			
		}*/ //era para anterior version
		
		
	}
	/*public void render(int[]pixels,int offset,int row){
		//>> multiplica yOffset
		for(int yTile =yOffset>>3;yTile<=(yOffset+height)>>3;yTile++){//0100//01000000//printea las tiles
			int yMin= yTile*8 - yOffset;
			int yMax= yMin + 8;
			if(yMin<0)//verificar los bounds
				yMin=0;
			if(yMax>height)
				yMax=height;//los mantiene entre las posiciones
		
			for(int xTile=xOffset>>3;xTile<=(yOffset+width)>>3;xTile++){
				int xMin= xTile*8 - xOffset;
				int xMax= xMin + 8;
				if(xMin<0)
					xMin=0;
				if(xMax>width)
					xMax=width;
				
				int tileIndex = (xTile & (MAP_WIDTH_MASK))+(yTile & (MAP_WIDTH_MASK))*MAP_WIDTH;
			
				for(int y = yMin;y<yMax;y++){
					int sheetPixel =((y+yOffset)&7)*sheet.width+((xMin+xOffset)&7);
					int tilePixel=offset +xMin + y *row;
					for(int x=xMin;x<xMax;x++){
						int colour=tileIndex*4+sheet.pixels[sheetPixel++];
						pixels[tilePixel++]=colores[colour];
					}
				}
			
			}
			
		}
			
	}*/
	public void render(int xPos,int yPos,int tile,int color,boolean mirrorX,boolean mirrorY){
		xPos-= xOffset;
		yPos-= yOffset;
		//dar un nombre a cada tile
		int xTile=tile %32;
		int yTile=tile/32;
		int tileOffset =(xTile<<3)+(yTile<<3)*sheet.width;
		
		for(int y=0;y<8;y++){
			int ySheet=y;
			if(mirrorY) ySheet=7-y;
			if(y+yPos < 0 || y+ yPos>=height)continue;
			
			
			for(int x=0;x<8;x++){
				int xSheet=x;
				if(mirrorX) xSheet=7-x;
				if(x+xPos < 0 || x+ xPos>=width)continue;
				
				int col =(color>> (sheet.pixels[xSheet+ySheet*sheet.width+tileOffset]*8))& 255;//te da color data de donde tile estas
				if(col<255)pixels[(x+xPos)+(y+yPos)*width]=col;
			}
		}
		
	}
	public void render(int xPos,int yPos,int tile,int color) {
		render(xPos,yPos,tile,color,false,false);
		
	}
	public void setOffset(int xOffset2, int yOffset2) {
		// TODO Auto-generated method stub
		xOffset=xOffset2;
		yOffset=yOffset2;
		
	}
}
