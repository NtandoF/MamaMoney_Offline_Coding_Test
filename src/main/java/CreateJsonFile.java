import MamaMoney.Node2;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;
import java.text.ParseException;

public class CreateJsonFile extends Node2 {

    public static void main(String[] args) {
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "howtodoinjava.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {

            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadJSONExample
    {
        @SuppressWarnings("unchecked")
        public static void main(String[] args)
        {
            //JSON parser object to parse read file

            try (FileReader reader = new FileReader("employees.json"))
            {
                //Read JSON file
                BufferedReader bufferedReader = new BufferedReader(reader);;

                JSONArray employeeList = (JSONArray) bufferedReader;
                System.out.println(employeeList);

                //Iterate over employee array
                employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        private static void parseEmployeeObject(JSONObject employee)
        {
            //Get employee object within list
            JSONObject employeeObject = (JSONObject) employee.get("employee");

            //Get employee first name
            String firstName = (String) employeeObject.get("firstName");
            System.out.println(firstName);

            //Get employee last name
            String lastName = (String) employeeObject.get("lastName");
            System.out.println(lastName);

            //Get employee website name
            String website = (String) employeeObject.get("website");
            System.out.println(website);
        }
    }
}



