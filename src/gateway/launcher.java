package gateway;

import broker.Patients;
import engine.CSVHandler;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class launcher {
    public static void main(String[] args) throws IOException, ParseException {
        List<Patients> patients = CSVHandler.readFromFile("PatientInfo.csv");

        //{male=1, female=2, Undefined=3}
        Map<String, Integer> gender = new LinkedHashMap<>();
        List<Patients> genderIndexedList = patients.stream().peek(p -> {
            Integer currentValue = gender.get(p.getSex());
            if (currentValue == null) {
                currentValue = gender.size() + 1;
                gender.put(p.getSex(), currentValue);
            }
            p.setGender_index(currentValue);
        }).collect(Collectors.toList());


        // {50=1, 30=2, 20=3, 60=4, 80=5, 70=6, 40=7, 10=8, 90=9, 0=10, -1=11, 100=12}

        Map<String, Integer> ageGroup = new LinkedHashMap<>();
        List<Patients> ageIndexedList = patients.stream().peek(p -> {
            Integer currentValue = ageGroup.get(p.getAge_group());
            if (currentValue == null) {
                currentValue = ageGroup.size() + 1;
                ageGroup.put(p.getAge_group(), currentValue);
            }
            p.setAge_group_index(currentValue);
        }).collect(Collectors.toList());



        // {Korea=1, China=2, United States=3, France=4, Thailand=5, Canada=6, Switzerland=7, Indonesia=8, Foreign=9, Mongolia=10, Spain=11}
        Map<String, Integer> country = new LinkedHashMap<>();
        List<Patients> countryIndexedList = patients.stream().peek(p -> {
            Integer currentValue = country.get(p.getCountry());
            if (currentValue == null) {
                currentValue = country.size() + 1;
                country.put(p.getCountry(), currentValue);
            }
            p.setCountry_index(currentValue);
        }).collect(Collectors.toList());


        // {FALSE=1, TRUE=2}
        Map<String, Integer> disease = new LinkedHashMap<>();
        List<Patients> diseaseIndexedList = patients.stream().peek(p -> {
            Integer currentValue = disease.get(p.getDisease());
            if (currentValue == null) {
                currentValue = disease.size() + 1;
                disease.put(p.getDisease(), currentValue);
            }
            p.setDisease_index(currentValue);
        }).collect(Collectors.toList());


        // {Gangseo-gu=1, Jungnang-gu=2, Jongno-gu=3, Mapo-gu=4, Seongbuk-gu=5, etc=6, Songpa-gu=7, Seodaemun-gu=8, Seongdong-gu=9, Seocho-gu=10, Guro-gu=11, Gangdong-gu=12, Eunpyeong-gu=13, Geumcheon-gu=14, Gwanak-gu=15, Nowon-gu=16, Dongjak-gu=17, Gangnam-gu=18, Yangcheon-gu=19, Gwangjin-gu=20, Dongdaemun-gu=21, Yeongdeungpo-gu=22, Dobong-gu=23, Yongsan-gu=24, Gangbuk-gu=25, Jung-gu=26, Dongnae-gu=27, Haeundae-gu=28, Yeonje-gu=29, =30, Buk-gu=31, Nam-gu=32, Seo-gu=33, Geumjeong-gu=34, Saha-gu=35, Suyeong-gu=36, Sasang-gu=37, Busanjin-gu=38, Gijang-gun=39, Dong-gu=40, Dalseo-gu=41, Dalseong-gun=42, Suseong-gu=43, Bupyeong-gu=44, Michuhol-gu=45, Yeonsu-gu=46, Gyeyang-gu=47, Namdong-gu=48, Ganghwa-gun=49, Yuseong-gu=50, Daedeok-gu=51, Ulju-gun=52, Sejong=53, Goyang-si=54, Pyeongtaek-si=55, Bucheon-si=56, Suwon-si=57, Guri-si=58, Siheung-si=59, Gimpo-si=60, Icheon-si=61, Pocheon-si=62, Anyang-si=63, Yongin-si=64, Paju-si=65, Namyangju-si=66, Seongnam-si=67, Gwacheon-si=68, Gwangmyeong-si=69, Hwaseong-si=70, Osan-si=71, Gunpo-si=72, Uiwang-si=73, Ansan-si=74, Gwangju-si=75, Anseong-si=76, Uijeongbu-si=77, Hanam-si=78, Dongducheon-si=79, Yangju-si=80, Gapyeong-gun=81, Gangneung-si=82, Samcheok-si=83, Sokcho-si=84, Wonju-si=85, Chuncheon-si=86, Taebaek-si=87, Inje-gun=88, Jeungpyeong-gun=89, Cheongju-si=90, Eumseong-gun=91, Chungju-si=92, Goesan-gun=93, Danyang-gun=94, Jincheon-gun=95, Gyeryong-si=96, Cheonan-si=97, Asan-si=98, Seosan-si=99, Hongseong-gun=100, Taean-gun=101, Buyeo-gun=102, Seocheon-gun=103, Nonsan-si=104, Gunsan-si=105, Gimje-si=106, Jeonju-si=107, Iksan-si=108, Jangsu-gun=109, Suncheon-si=110, Yeosu-si=111, Gwangyang-si=112, Hwasun-gun=113, Muan-gun=114, Mokpo-si=115, Gyeongsan-si=116, Gyeongju-si=117, Goryeong-gun=118, Gumi-si=119, Gunwi-gun=120, Gimcheon-si=121, Mungyeong-si=122, Bonghwa-gun=123, Sangju-si=124, Seongju-gun=125, Andong-si=126, Yeongdeok-gun=127, Yeongyang-gun=128, Yeongju-si=129, Yeongcheon-si=130, Yecheon-gun=131, Uiseong-gun=132, Cheongdo-gun=133, Cheongsong-gun=134, Chilgok-gun=135, Pohang-si=136, Hapcheon-gun=137, Jinju-si=138, Changwon-si=139, Yangsan-si=140, Geoje-si=141, Hamyang-gun=142, Goseong-gun=143, Gimhae-si=144, Namhae-gun=145, Geochang-gun=146, Changnyeong-gun=147, Miryang-si=148, Haman-gun=149, Sancheong-gun=150, Sacheon-si=151, Jeju-do=152}
        Map<String, Integer> city = new LinkedHashMap<>();
        List<Patients> cityIndexedList = patients.stream().peek(p -> {
            Integer currentValue = city.get(p.getCity());
            if (currentValue == null) {
                currentValue = city.size() + 1;
                city.put(p.getCity(), currentValue);
            }
            p.setCity_index(currentValue);
        }).collect(Collectors.toList());


        // {Seoul=1, Busan=2, Daegu=3, Gwangju=4, Incheon=5, Daejeon=6, Ulsan=7, Sejong=8, Gyeonggi-do=9, Gangwon-do=10, Chungcheongbuk-do=11, Chungcheongnam-do=12, Jeollabuk-do=13, Jeollanam-do=14, Gyeongsangbuk-do=15, Gyeongsangnam-do=16, Jeju-do=17}
        Map<String, Integer> province = new LinkedHashMap<>();
        List<Patients> provinceIndexedList = patients.stream().peek(p -> {
            Integer currentValue = province.get(p.getProvince());
            if (currentValue == null) {
                currentValue = province.size() + 1;
                province.put(p.getProvince(), currentValue);
            }
            p.setProvince_index(currentValue);
        }).collect(Collectors.toList());


        // {overseas inflow=1, contact with patient=2, Seongdong-gu APT=3, etc=4, Eunpyeong St. Mary's Hospital=5, Shincheonji Church=6, Dongan Church=7, Guro-gu Call Center=8, Onchun Church=9, Cheongdo Daenam Hospital=10, Suyeong-gu Kindergarten=11, Undefined=12, Ministry of Oceans and Fisheries=13, gym facility in Cheonan=14, gym facility in Sejong=15, River of Grace Community Church=16, Gyeongsan Seorin Nursing Home=17, Gyeongsan Cham Joeun Community Center=18, Gyeongsan Jeil Silver Town=19, Bonghwa Pureun Nursing Home=20, Pilgrimage to Israel=21, Milal Shelter=22, Geochang Church=23, Changnyeong Coin Karaoke=24}
        Map<String, Integer> infection_case = new LinkedHashMap<>();
        List<Patients> infection_caseIndexedList = patients.stream().peek(p -> {
            Integer currentValue = infection_case.get(p.getInfection_case());
            if (currentValue == null) {
                currentValue = infection_case.size() + 1;
                infection_case.put(p.getInfection_case(), currentValue);
            }
            p.setInfection_case_index(currentValue);
        }).collect(Collectors.toList());



        //{released=1, isolated=2, deceased=3}
        Map<String, Integer> state = new LinkedHashMap<>();
        List<Patients> stateIndexedList = patients.stream().peek(p -> {
            Integer currentValue = state.get(p.getState());
            if (currentValue == null) {
                currentValue = state.size() + 1;
                state.put(p.getState(), currentValue);
            }
            p.setState_index(currentValue);
        }).collect(Collectors.toList());

        // {01=1, -1=2, 02=3, 03=4, 04=5}
        Map<String, Integer> symptoms_date = new LinkedHashMap<>();
        List<Patients> symptoms_dateIndexedList = patients.stream().peek(p -> {
            Integer currentValue = symptoms_date.get(p.getSymptom_onset_date());
            if (currentValue == null) {
                currentValue = symptoms_date.size() + 1;
                symptoms_date.put(p.getSymptom_onset_date(), currentValue);
            }
            p.setSymptoms_date_index(currentValue);
        }).collect(Collectors.toList());


        // {01=1, 02=2, 03=3, 04=4, -1=5}
        Map<String, Integer> confirmed_date = new LinkedHashMap<>();
        List<Patients> confirmed_dateIndexedList = patients.stream().peek(p -> {
            Integer currentValue = confirmed_date.get(p.getConfirmed_date());
            if (currentValue == null) {
                currentValue = confirmed_date.size() + 1;
                confirmed_date.put(p.getConfirmed_date(), currentValue);
            }
            p.setConfirmed_date_index(currentValue);
        }).collect(Collectors.toList());

        //{02=1, 03=2, -1=3, 04=4}
        Map<String, Integer> released_date = new LinkedHashMap<>();
        List<Patients> released_dateIndexedList = patients.stream().peek(p -> {
            Integer currentValue = released_date.get(p.getReleased_date());
            if (currentValue == null) {
                currentValue = released_date.size() + 1;
                released_date.put(p.getReleased_date(), currentValue);
            }
            p.setReleased_date_index(currentValue);
        }).collect(Collectors.toList());


        //{-1=1, 02=2, 03=3, 04=4}
        Map<String, Integer> deceased_date = new LinkedHashMap<>();
        List<Patients> deceased_dateIndexedList = patients.stream().peek(p -> {
            Integer currentValue = deceased_date.get(p.getDeceased_date());
            if (currentValue == null) {
                currentValue = deceased_date.size() + 1;
                deceased_date.put(p.getDeceased_date(), currentValue);
            }
            p.setDeceased_date_index(currentValue);
        }).collect(Collectors.toList());




        Double[][] doubleMatrix = to2DDoubleMatrix(genderIndexedList, p -> {
            return new Double[] {Double.valueOf(p.getGender_index()), Double.valueOf(p.getAge_group_index()), Double.valueOf(p.getDisease_index()),
                    Double.valueOf(p.getCountry_index()), Double.valueOf(p.getProvince_index()),
                    Double.valueOf(p.getInfection_case_index()), Double.valueOf(p.getState_index()),
                    Double.valueOf(p.getSymptoms_date_index()), Double.valueOf(p.getConfirmed_date_index()),
                    Double.valueOf(p.getReleased_date_index()), Double.valueOf(p.getDeceased_date_index())};
        });

        printDoubleMatrix(doubleMatrix);



    }

    private static <T> Double[][] to2DDoubleMatrix(List<T> list, Function<T, Double[]> mapper) {

        List<Double[]> numericalList = list.stream().map(mapper).collect(Collectors.toList());

        Double[][] matrix = numericalList.toArray(new Double[0][]);

        return matrix;

    }

    private static void printDoubleMatrix(Double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}