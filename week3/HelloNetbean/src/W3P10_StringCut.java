
import java.util.Scanner;

/*
silpakorn university
i

*/
/**
 *
 * @author Pakkapon
 */
public class W3P10_StringCut {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String cut = sc.nextLine();
        int position = 0,newPosition = 0;
        boolean isDo = false,isPrint = false;
        while(true){
            newPosition = input.indexOf(cut,position);
            if(newPosition == -1){
                if(input.length() - position > 0 && isDo){
                    System.out.println(input.substring(position,input.length()));
                    isPrint = true;
                }
                break;
            }
            isDo = true;
            if(newPosition - position > 0){
                System.out.println(input.substring(position,newPosition));
                isPrint = true;
            }
            position = newPosition+1;
        }
        if(!isDo){
            System.out.println("no target character found");
        }else if(!isPrint){
            System.out.println("no output");
        }
    }
}
