import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> games = new ArrayList<>(Arrays.asList("src","res", "savegames", "temp"));
        ArrayList<String> src = new ArrayList<>(Arrays.asList("main","test"));
        ArrayList<String> main = new ArrayList<>(Arrays.asList("Main.java","Utils.java"));
        ArrayList<String> res = new ArrayList<>(Arrays.asList("drawables","vectors", "icons"));

        StringBuilder str = new StringBuilder();


        for (int i = 0; i < games.size(); i++){
            String gameName = "C://Netology//Games//" + games.get(i);
            File gameDir = new File(gameName);
            if (gameDir.mkdir());
            str.append("Директория " + games.get(i) + " была создана" + "\n");
        }

        for (int i = 0; i <src.size(); i++){
            String srcName = "C://Netology//Games//src//" + src.get(i);
            File srcDir = new File(srcName);
            srcDir.mkdir();
            if (srcDir.mkdir());
            str.append("Директория " + src.get(i) + " была создана" + "\n");
        }
        for (int i = 0; i <main.size(); i++){
            String mainName = "C://Netology//Games//src//main";
            File mainFile = new File(mainName, main.get(i));
            try{
                if (mainFile.createNewFile())
                    str.append("Файл " + main.get(i) + " был создан" + "\n");;
            } catch (IOException exception){
                System.out.println(exception.getMessage());
            }
        }

        for (int i = 0; i <res.size(); i++){
            String resName = "C://Netology//Games//res//" + res.get(i);
            File resDir = new File(resName);
            resDir.mkdir();
            if (resDir.mkdir());
            str.append("Директория " + res.get(i) + " была создана" + "\n");
        }

        File tempFile = new File("C://Netology//Games//temp", "temp.txt");
        try {
            if (tempFile.createNewFile());
            str.append("Файл temp.txt был создан" + "\n");
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
        try(FileWriter writer = new FileWriter("C://Netology//Games//temp//temp.txt", true)){
            writer.write(String.valueOf(str));
        }
    }

}
