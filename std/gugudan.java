package std;

public class gugudan {
    
    public static void main(String args[]) {
        int[] a = new int[]{
            2,3,4,5,6,7,8,9
        };
        int[] b = new int[]{
            1,2,3,4,5,6,7,8,9
        };
        
        // 구구단 만들기
        int x =0;
        int y =0;
        int r =0;
      
        for(x=0; x<3; x++){
              for(y=0; y<8; y++){
                r = a[x]*a[y];
                String rs1 = "";
                String rs2 = "";
                if(!(a[x] == b[y+1])){
                    rs1 = "X";
                    rs2 = "=";
                    System.out.print(a[x]+rs1+b[y+1]+rs2+r);
                    System.out.print("\t");
                }else {
                    System.out.print("======");
                    System.out.print("\t");
                }
            }
        }
        
        System.out.println();
        
        for(x=3; x<6; x++){
              for(y=0; y<8; y++){
                r = a[x]*a[y];
                String rs1 = "";
                String rs2 = "";
                if(!(a[x] == b[y+1])){
                    rs1 = "X";
                    rs2 = "=";
                    System.out.print(a[x]+rs1+b[y+1]+rs2+r);
                    System.out.print("\t");
                }else {
                    System.out.print("======");
                    System.out.print("\t");
                }
            }
        }
        
        System.out.println();
        
        for(x=6; x<8; x++){
              for(y=0; y<8; y++){
                r = a[x]*a[y];
                String rs1 = "";
                String rs2 = "";
                if(!(a[x] == b[y+1])){
                    rs1 = "X";
                    rs2 = "=";
                    System.out.print(a[x]+rs1+b[y+1]+rs2+r);
                    System.out.print("\t");
                }else {
                    System.out.print("======");
                    System.out.print("\t");
                }
            }
        }
    }
}