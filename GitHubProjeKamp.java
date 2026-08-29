
import java.util.Scanner;


public class GitHubProjeKamp {

   
    public static void main(String[] args) {
        System.out.println("cizmek istediginiz seklin ismini yazin(ucgen/kare)");
Scanner input = new Scanner(System.in);


String name = input.nextLine();
System.out.print("sayi girin: ");      
int num = input.nextInt();//kullanıcının girdiği sayı
input.nextLine();

        if (name.equalsIgnoreCase("kare")) {
          for(int x=num;x>=1;x--){
            if(x==num || x==1){ //üst kenar ve alt kenar için seri * basıyor
                for (int i = num; i>=1; i--) {
                    System.out.print("* ");
                }
                
            }
            else{
                System.out.print("* ");//ilk başta yıldız basıyor
                for (int i = num-1; i >=2; i--) {
                    System.out.print("  ");//bu döngüde ortada boşluk oluşturmak amaçlanıyor. boşluk olduğu için num-1 den başlayıp 2 ye gelince duruyor
                }
                System.out.print("* ");
            }
            System.out.println("");
        }

        }
        
        
        
        
        
    ///////////////////////////////////////////////////////////////////    Bu da üçgen bölümü
        else if(name.equalsIgnoreCase("ucgen")){
            
            
            
            
            
            
        }


    }
    
}
