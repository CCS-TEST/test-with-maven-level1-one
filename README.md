# Test - with a maven project.

### Instructions for the test.

##### run the following commands


1. git clone  https://github.com/CCS-TEST/test-with-maven-level1-one.git

2. cd test-with-maven-level1-one

3. Open pom.xml of this folder in intelliJ 
<a href="https://drive.google.com/uc?export=view&id=1HRTWktnpXEbyT4EdlEBLM9ys-joVbzmb"><img src="https://drive.google.com/uc?export=view&id=1HRTWktnpXEbyT4EdlEBLM9ys-joVbzmb" style="width: 500px; max-width: 100%; height: auto" title="Click for the larger version." /></a>

4. Open as a project ( in new window or this window is your choice)

5. Open terminal - from inside intelliJ or outside ( does not matter as long as you are in the right folder).

6. IntelliJ might ask you to add files to git. You should <span style="color:red">some **NOT** </span> add anything to git.
<a href="https://drive.google.com/uc?export=view&id=1L6bveok4bgg4mD2I1pFqqnuOuPUt3Z8N"><img src="https://drive.google.com/uc?export=view&id=1L6bveok4bgg4mD2I1pFqqnuOuPUt3Z8N" style="width: 500px; max-width: 100%; height: auto" title="Click for the larger version." /></a>

7. In terminal run: mvn clean compile test-compile. Build should be successful. 

8. Now run: mvn clean install. You should see a bunch of failures.

9. Go to src/main/java/ and package ccs.test.mvn.level1.one and start coding.

10. You know you did a decent job when mvn clean install results in a successful build



 


