package std;
import java.util.Scanner;

public class studentScore {
    // 전역변수
    private static Scanner kb; // 키보드
    private static int[][] a;  // 배열
    
    public static void main(String args[]) {
        //가장 처음 실행되는 함수
        kb = new Scanner(System.in);
        a = new int[5][3];
        String cmd;
        
        // 기능 실행
        do{
            System.out.print("cmd > ");
            cmd = kb.nextLine();
            
            // 1. 점수표 출력하기
            if("list".equals(cmd)){
                viewScoreTable();
            }
            
            // 2. 점수를 입력하고 그 이상인 학생 출력 
            if("over".equals(cmd)){
                System.out.print("over > ");
                
                // 키보드에서 정수를 입력받을 때 사용
                int num = kb.nextInt();
                kb.nextLine(); // 숫자가 아닌 엔터값은 버리는 것
                
                viewOverScore(num);
            }
            
            
            // 3. 점수 수정 : 선택 - 학생, 과목 값 입력
            if("edit".equals(cmd)){
                System.out.println("학생번호 과목번호 점수값 >");
                String s = kb.nextLine();
                // 공백을 기준으로 3개로 나눈다 => 정수로 변환(키보느는 String이여서)
                editScore(s);
            }
            
            // 4. 점수 등록하기 : 선택 - 학생, 과목 값 입력
            if("input".equals(cmd)){
                System.out.println("학생번호 점수값(3) >");
                String s = kb.nextLine();
                // 공백을 기준으로 3개로 나눈다 => 정수로 변환(키보느는 String이여서)
                inputScore(s.split(" ")); // 변환해서 배열로 전달함
            }
            
        } while( !("exit".equals(cmd))); 
        // 처음에 실행되고 참이라면 반복
        // 사용자가 "exit" 입력하면 멈춘다
        System.out.println("terminated");
    }
    
    
    // 1-1.학생 한명 출력하기
    public static void stdScore(int row) {
        for(int col=0; col<a[0].length; col++){
                System.out.print( a[row][col] + "\t");
            }
            System.out.println();
    }
    
    // 1. 점수표 함수
    public static void viewScoreTable(){
        // 학생 전체
        for(int row=0; row<a.length; row++){
            // 한명당 한줄씩 출력하기 위해 
            stdScore(row); // row번 학생 점수 출력
        }
    }
    
    // 2-1.학생 점수 중에 하나라도 key값 이상의 점수있나 체크
    public static boolean hasOverScore(int row, int key){
        // 초기값 설정
        boolean has = false;
        for(int i=0; i<3; i++){
            if(a[row][i] >= key){
                has = true;
                break;// 하나라도여서 (모두라면 break는 없어야함)
            }
        }
        return has;
    }
    
    // 2.점수입력하고 학생 출력 함수
    public static void viewOverScore(int key){
        // 학생 전체
        for(int row=0; row<a.length; row++){
            // 학생들 점수 중에 하나라도 key이상의 점수가 있다면
            // if()안에는 boolean만 사용가능(true, false)
            if(hasOverScore(row, key)){
                stdScore(row);
            }
        }
    }
    
    // 3. 점수 수정하기
    public static void editScore(String s){
        // 문자열 쪼개기
        String[] splited = s.split(" ");
        if( splited.length == 3 ){
            int row = Integer.parseInt(splited[0]); // 학생번호
            int col = Integer.parseInt(splited[1]); // 과목번호
            int score = Integer.parseInt(splited[2]); // 점수
            
            // 수정하기
            a[row][col] = score;
        } else {
            System.out.println("3개를 입력해 주세요");
        }
    }
    
    // 4.점수 입력하기
    public static void inputScore(String[] s){
        if( s.length == 4){
            int row = Integer.parseInt(s[0]);
            for(int i=0; i<3; i++){
                a[row][i] = Integer.parseInt(s[i+1]);
            }
        } else {
            System.out.println("4개를 입력해 주세요");
        }
    }
}