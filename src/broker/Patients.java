package broker;

public class Patients {
    private Integer patient_id;
    private Integer global_num;
    private String sex;
    private Integer birth_year;
    private String age_group;
    private String country;
    private String province;
    private String city;
    private String disease;
    private String infection_case;
    private Integer infection_order;
    private String infected_by;
    private Integer contact_number;
    private String symptom_onset_date;
    private String confirmed_date;
    private String released_date;
    private String deceased_date;
    private String state;

    private Integer gender_index;
    private Integer age_group_index;
    private Integer country_index;
    private Integer disease_index;
    private Integer city_index;
    private Integer province_index;
    private Integer infection_case_index;
    private Integer state_index;

    public Integer getState_index() {
        return state_index;
    }

    public void setState_index(Integer state_index) {
        this.state_index = state_index;
    }

    public Integer getInfection_case_index() {
        return infection_case_index;
    }

    public void setInfection_case_index(Integer infection_case_index) {
        this.infection_case_index = infection_case_index;
    }

    public Integer getProvince_index() {
        return province_index;
    }

    public void setProvince_index(Integer province_index) {
        this.province_index = province_index;
    }





    public Integer getCity_index() {
        return city_index;
    }

    public void setCity_index(Integer city_index) {
        this.city_index = city_index;
    }

    public Integer getDisease_index() {
        return disease_index;
    }

    public void setDisease_index(Integer disease_index) {
        this.disease_index = disease_index;
    }

    public Integer getCountry_index() {
        return country_index;
    }

    public void setCountry_index(Integer country_index) {
        this.country_index = country_index;
    }


    public Integer getAge_group_index() {
        return age_group_index;
    }

    public void setAge_group_index(Integer age_group_index) {
        this.age_group_index = age_group_index;
    }

    public Integer getGender_index() {
        return gender_index;
    }

    public void setGender_index(Integer gender_index) {
        this.gender_index = gender_index;
    }

    public Integer getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(Integer patient_id) {
        this.patient_id = patient_id;
    }

    public Integer getGlobal_num() {
        return global_num;
    }

    public void setGlobal_num(Integer global_num) {
        this.global_num = global_num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(Integer birth_year) {
        this.birth_year = birth_year;
    }

    public String getAge_group() {
        return age_group;
    }

    public void setAge_group(String age) {
        this.age_group = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getInfection_case() {
        return infection_case;
    }

    public void setInfection_case(String infection_case) {
        this.infection_case = infection_case;
    }

    public Integer getInfection_order() {
        return infection_order;
    }

    public void setInfection_order(Integer infection_order) {
        this.infection_order = infection_order;
    }

    public String getInfected_by() {
        return infected_by;
    }

    public void setInfected_by(String infected_by) {
        this.infected_by = infected_by;
    }

    public Integer getContact_number() {
        return contact_number;
    }

    public void setContact_number(Integer contact_number) {
        this.contact_number = contact_number;
    }

    public String getSymptom_onset_date() {
        return symptom_onset_date;
    }

    public void setSymptom_onset_date(String symptom_onset_date) {
        this.symptom_onset_date = symptom_onset_date;
    }

    public String getConfirmed_date() {
        return confirmed_date;
    }

    public void setConfirmed_date(String confirmed_date) {
        this.confirmed_date = confirmed_date;
    }

    public String getReleased_date() {
        return released_date;
    }

    public void setReleased_date(String released_date) {
        this.released_date = released_date;
    }

    public String getDeceased_date() {
        return deceased_date;
    }

    public void setDeceased_date(String deceased_date) {
        this.deceased_date = deceased_date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "patient_id=" + patient_id +
                ", global_num=" + global_num +
                ", sex='" + sex + '\'' +
                ", birth_year=" + birth_year +
                ", age_group='" + age_group + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", disease='" + disease + '\'' +
                ", infection_case='" + infection_case + '\'' +
                ", infection_order=" + infection_order +
                ", infected_by='" + infected_by + '\'' +
                ", contact_number=" + contact_number +
                ", symptom_onset_date='" + symptom_onset_date + '\'' +
                ", confirmed_date='" + confirmed_date + '\'' +
                ", released_date='" + released_date + '\'' +
                ", deceased_date='" + deceased_date + '\'' +
                ", state='" + state + '\'' +
                ", gender_index=" + gender_index +
                ", age_group_index=" + age_group_index +
                ", country_index=" + country_index +
                ", disease_index=" + disease_index +
                ", city_index=" + city_index +
                ", province_index=" + province_index +
                ", infection_case_index=" + infection_case_index +
                ", state_index=" + state_index +
                '}';
    }
}
