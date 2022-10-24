
//Дана json строка 
//Написать метод(ы), который распарсит json и, используя StringBuilder, 
//создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

import java.io.*;


public class task2 {

    public static String[] ParseJson(String jsonStr){
        String[] student = jsonStr
                .substring(2, jsonStr.length()-2)
                .split("},\\{");
        String[] pars = new String[student.length];
        for (int i = 0; i < student.length; i++) {
            String[] keyValue = student[i].split(",");
            pars[i] = new StringBuilder("Студент ")
                    .append(GetValue(keyValue[0]))
                    .append(" получил(a) ")
                    .append(GetValue(keyValue[1]))
                    .append(" по предмету ")
                    .append(GetValue(keyValue[2]))
                    .toString();
        }
        return pars;
    }

    
    public static void main(String[] args) {
        String jsonStr = null;
        try (BufferedReader  reader = new BufferedReader(new FileReader(new File("task2.json")))) {
            jsonStr = reader.readLine();
            System.out.println(String.join("\n", ParseJson(jsonStr)));
        }
        catch (Exception ex) {
            System.out.println("Ошибка ");
            System.out.println(ex.getMessage());
        }
    }

    public static String GetValue(String keyValue) {
        String value =  keyValue.split(":")[1];
        return value.substring(1,value.length()-1);
    }
    
}