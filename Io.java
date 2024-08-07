// java IO --> operators on sequence of data elements 

// Byte stream
// Character stream

// Byte stream --> in the form of bytes, reading and writing 


// import java.io.FileInputStream;
// import java.io.IOException;

// import java.io.FileOutputStream;

// public class Io{
//     public static void main(String[] args) throws IOException{
//         try(FileInputStream obj = new FileInputStream("example.txt")){
//             int content;
//             while((content=obj.read())!=-1){
//                 System.err.println((char)content);
//             }
//         }catch(IOException e){
//             System.out.print(e);
//         }

//     }
// }


// public class Io{
//     public static void main(String[] args) throws IOException {
//         String str = "hello, world";
//         try(FileOutputStream obj = new FileOutputStream("example3.txt")){
//             obj.write(str.getBytes());
//         }catch(IOException e){
//             System.out.println(e);
//         }

//     }
// }

// character stream 

// import java.io.FileReader;
// import java.io.IOException;

// public class Io{
//     public static void main(String[] args) throws IOException{
//         try (FileReader obj = new FileReader("example2.txt")){
//             int content;
//             while ((content=obj.read())!=-1) {
//                 System.out.print((char)content);
//             }
//         }catch(IOException e){
//             System.out.print(e);
//         }
//     }
// }


// program-->file

// import java.io.FileWriter;
// import java.io.IOException;

// public class Io{
//     public static void main(String[] args) throws IOException {
//         String str = "absdjjkkjsdfksdfkjsdf";
//         try(FileWriter obj = new FileWriter("example4.txt")){
//             obj.write(str);
//         }catch(IOException e){
//             System.out.println(e);
//         }
//     }
// }

// write 
// program-->buffer-->file
// read
// progrm<--buffer<--file

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Io{
    public static void main(String[] args) throws IOException {
        try(BufferedWriter obj = new BufferedWriter(new FileWriter("example.txt"))){
             obj.write("overridden text");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}


