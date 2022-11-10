import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GPAConverter {
    public static void main(String[] args){
        try{
            File file = new File("GPAConverter.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("<head>\n");
            writer.write("\s<title>GPA Converter(GPA환산기)</title>\n");
            writer.write("\s</head>\n");
            writer.write("<h1>GPA Converter</h1>");
            writer.write("Subject1:<input type=\"text\" id=\"v1_1\">Credit:<input type=\"text\" id=\"v1_2\">Grade:<input type=\"text\" id=\"v1_3\"><br>");
            writer.write("Subject1:<input type=\"text\" id=\"v2_1\">Credit:<input type=\"text\" id=\"v2_2\">Grade:<input type=\"text\" id=\"v2_3\"><br>");
            writer.write("Subject1:<input type=\"text\" id=\"v3_1\">Credit:<input type=\"text\" id=\"v3_2\">Grade:<input type=\"text\" id=\"v3_3\"><br>");
            writer.write("Subject1:<input type=\"text\" id=\"v4_1\">Credit:<input type=\"text\" id=\"v4_2\">Grade:<input type=\"text\" id=\"v4_3\"><br>");
            writer.write("Subject1:<input type=\"text\" id=\"v5_1\">Credit:<input type=\"text\" id=\"v5_2\">Grade:<input type=\"text\" id=\"v5_3\"><br>");
            writer.write("\s</body>\n");
            writer.write("<br><br>\n");
            writer.write("Total Credit:<input type=\"text\" id=\"TotalCredit\"><br>\n");
            writer.write("Result:<input type=\"text\" id=\"Result\"><br>\n");
            writer.write("<br><br>\n");
            writer.write("<input type=\"button\" value=\"Calculate\" onclick=\"cal()\">\n");
            writer.write("<input type=\"button\" value=\"Reset\" onclick=\"reset()\">\n");
            writer.write("<h2>Creator</h2>\n");
            writer.write("\s</body>\n");
            writer.write("Yaegun Kim\n");
            writer.write("- University of Seoul, Philosophy major(2022)\n");
            writer.write("- Washington State University, Computer Science major, Mathematics Minor(2022-2026)\n");
            writer.write("\s</body>\n");
            writer.write("\s</html>\n");
            

            writer.close();

        } catch(IOException e){
            e.printStackTrace();
        }




    }

}
