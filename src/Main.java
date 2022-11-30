import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        String[] arr = {"A a","B b","C c","D d", "E e","F f","G g","H h ","I i","J j","K k","L l","M m","N n","O o","P p","Q q","R r","S s","T t","U u","V v","W w","X x","Y y","Z z"};

        int[] number ={1,2,3,4,5,6,7,8,9};

       try (FileWriter fileWriter = new FileWriter("text.txt")){

           for (String a : arr) {
               fileWriter.write(a + "\n");

           }
               for (int num : number) {
                   fileWriter.write(num+"\n");
               }


       } catch (IOException e) {
           throw new RuntimeException(e);
       }

       try{
           FileReader fileReader = new FileReader("text.txt");

            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine())
                System.out.println(scanner.nextLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}