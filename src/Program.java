import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        ParsData parsData = new ParsData();
        String newFileName = null;
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new NameException();
            } catch (NameException e) {
                data = parsData.parsInputData();
            }
        }

        newFileName = data.get("Фамилия") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);

    }
}
