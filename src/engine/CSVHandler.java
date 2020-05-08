package engine;

import broker.Patients;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class CSVHandler {


    public static List<Patients> readFromFile(String fileLocation) throws IOException {

        List<String> patientsData = Files.readAllLines(new File(fileLocation).toPath());
        //ageCalculator(patientsData);


        List<Patients> patientsList = new ArrayList<>();
        patientsData.remove(0);

        for (String line: patientsData){
            String[] parts = line.split(",");
            Patients patient = new Patients();

            if (parts[2].isBlank()){
                patient.setSex("Undefined");
            }else {
                patient.setSex(parts[2]);
            }

            if (parts[3].isBlank()){
                patient.setBirth_year(1000);
            }else {
                patient.setBirth_year(Integer.valueOf(parts[3]));
            }

            if (parts[4].isBlank()){
                patient.setAge_group("-1");
            } else {
                patient.setAge_group(parts[4].split("s")[0]);
            }

            patient.setCountry(parts[5]);
            patient.setProvince(parts[6]);
            patient.setCity(parts[7]);
            if (parts[8].equals("TRUE")) {
                patient.setDisease(parts[8]);
            } else{
                patient.setDisease("FALSE");
            }

            if (parts[9].isBlank()){
                patient.setInfection_case("Undefined");
            }else {
                patient.setInfection_case(parts[9]);
            }

            if (parts[10].isBlank()){
                patient.setInfection_order(0);
            }else {
                patient.setInfection_order(Integer.valueOf(parts[10]));
            }

            if (parts[11].isBlank()){
                patient.setInfected_by("0000");
            } else{
                patient.setInfected_by(parts[11]);
            }

            if (parts[12].isBlank()){
                patient.setContact_number(0);
            } else {
                patient.setContact_number(Integer.valueOf(parts[12]));
            }

            if (parts[13].isBlank()){
                patient.setSymptom_onset_date("-1");
            } else {
                patient.setSymptom_onset_date(parts[13].split("-")[1]);
            }

            if (parts[14].isBlank()){
                patient.setConfirmed_date("-1");
            } else {
                patient.setConfirmed_date(parts[14].split("-")[1]);
            }
            if (parts[15].isBlank()){
                patient.setReleased_date("-1");
            } else {
                patient.setReleased_date(parts[15].split("-")[1]);
            }
            if (parts[16].isBlank()){
                patient.setDeceased_date("-1");
            } else {
                patient.setDeceased_date(parts[16].split("-")[1]);
            }
            patient.setState(parts[17]);

            patientsList.add(patient);
        }


        return patientsList;

    }
}
