package hw.ch12;

public class MultiSideBorder extends Border  {
    char ch;
    int num;

    public MultiSideBorder(Display display, char ch, int num){
        super(display);
        this.ch=ch;
        this.num=num;

    }
    
    public int getColumns(){
        return num + display.getColumns() + num;
    }
    
    public int getRows(){
        return display.getRows();

    }

    public String getRowText(int row){ 
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < num; i++) {
            line.append(ch);
        }
        String lines = line.toString();
        return lines + display.getRowText(row) + lines;
    }
}
