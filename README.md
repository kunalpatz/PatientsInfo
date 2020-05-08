# Author
Kunal PATIL

# PatientsInfo

Project to parse information from csv file for patient's details with various attributes and converting these to index values o process and transform data provided.

## Arborsence
```java

PatientsInfo-
  |- src-
      |- Broker
        |- Patients.java
      |- Engine
        |- CSVHandler.java
      |- Gateway
        |- launcher.java
  |- sandbox
      |- <TestLaunchers>
  PatientInfo.csv
  
 ```
  
1. Way to process and transform data provided in the attached csv so that you get a Double matrix as a result.

Sample Output:
```java
2.0 3.0 1.0 1.0 17.0 1.0 1.0 2.0 3.0 4.0 1.0 
2.0 8.0 1.0 1.0 17.0 1.0 1.0 2.0 3.0 4.0 1.0 
2.0 3.0 1.0 1.0 17.0 1.0 2.0 2.0 3.0 3.0 1.0 
2.0 3.0 1.0 1.0 17.0 1.0 2.0 2.0 4.0 3.0 1.0 
1.0 2.0 1.0 1.0 17.0 2.0 2.0 2.0 4.0 3.0 1.0 
2.0 3.0 1.0 1.0 17.0 1.0 2.0 2.0 4.0 3.0 1.0 
2.0 8.0 1.0 2.0 17.0 1.0 2.0 2.0 4.0 3.0 1.0 
```

