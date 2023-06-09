import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");

//        Point1();
//        Point2();
//        Point3();
//        Point4();
//        Point5();
//        Point6();
//        DividePorCero();

//        String fileIn = "input.txt";
//        String fileOut = "output.txt";
//        Point8(fileIn, fileOut);

        Point9();



    }

    public static void Point1 (){
        String[] array = {
                "valor1",
                "valor2",
                "valor3",
                "valor4",
                "valor5"
        };

        for (String elements : array) {
            System.out.println(elements);
        }
    }

    public static void Point2() {
        int [][] array2 = { {1, 2}, {3, 4} };

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println("position [" + i + "][" + j + "]: " + array2[i][j]);
            }
        }
    }

    public static void Point3() {
        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(1);
        vector.remove(1);

        System.out.println(vector);
    }

    public static void Point4(){
        System.out.println("al ser añadidos 1000 elementos al " +
                "mismo tiempo a un vector" +
                " puede que sobrepase " +
                "la capacidad del vector" +
                ", haciendo que este se duplique");
    }

    public static void Point5() {
//        String[] array = {"valor1", "valor2", "valor3", "valor4"};
        ArrayList <String> arrayPoint5 = new ArrayList<String>(Arrays.asList("valor1", "valor2", "valor3", "valor4"));

        LinkedList <String> linkedPoint5 = new LinkedList<String>(arrayPoint5);

        for (String element : arrayPoint5) {
            System.out.println(element);
        }

        for (String element : linkedPoint5) {
            System.out.println(element);
        }
    }

    public static void Point6() {
        ArrayList <Integer> arrayPoint6 = new ArrayList<>();

        for (int i = 1; i < 11; i++ ) {
            arrayPoint6.add(i);
//            System.out.println(arrayPoint6);
        }

        for (int i = 0; i < arrayPoint6.size() ; i++ ) {
            if (arrayPoint6.get(i) % 2 == 0) {
                arrayPoint6.remove(i);
            }
        }
        System.out.println(arrayPoint6);
    }

    public static void DividePorCero() throws ArithmeticException{

        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Esto no se puede hacer");
        } finally {
            System.out.println("Demo de código");
        }
    }
    public static void Point8(String fileIn, String fileOut) throws IOException {
        InputStream inputStream = new FileInputStream(fileIn);
        OutputStream outputStream = new FileOutputStream(fileOut);

        byte[] buffer = new byte[1024];
        int length;

        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }

        inputStream.close();
        outputStream.close();


    }

    public static void Point9() throws FileNotFoundException {
        String fileName = "input.txt";
        InputStream inputStream = new FileInputStream(fileName);
        Scanner scanner = new Scanner(inputStream);

        Map<String, Integer> wordCount = new HashMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        List<String> words = new ArrayList<>(wordCount.keySet());
        Collections.sort(words);

        for (String word : words) {
            System.out.println(word + ": " + wordCount.get(word));
        }

        scanner.close();
    }
}