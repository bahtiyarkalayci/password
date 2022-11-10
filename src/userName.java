import java.util.Scanner;

public class userName {
    public static void main(String[] args) {

        String password,userName1,decide,newPassWord;

        Scanner Scanner=new Scanner(System.in);
        System.out.print("kullanıcı adınız:");
        userName1= Scanner.nextLine();
        System.out.print("şifrenizi giriniz");
        password=Scanner.nextLine();

        if(userName1.equals ("bahtiyar") && password.equals("12345")){
            System.out.println("hosgeldiniz");
        }
        else{
            System.out.println("yanlıs kullanici adi veya sifre girdiniz");

            System.out.print("şifrenizi değiştirmek istermisiniz");
            decide=Scanner.nextLine();
            if (decide.equals("yes")){
                System.out.print("yeni sifre giriniz");
                newPassWord=Scanner.nextLine();
                if (newPassWord.equals("12345")){
                    System.out.print("sifre olusturulamadı,lütfen baska bir sifre giriniz");

                   }   else    {
                    System.out.print("sifreniz degistirildi");
                             }
                         }
             else     {
                System.out.print("şifre değişikli istemediginiz icin giris yapamazsınız");
            }
        }
    }
}
