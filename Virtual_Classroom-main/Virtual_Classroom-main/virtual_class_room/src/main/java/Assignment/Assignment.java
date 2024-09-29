
package Assignment; //current package

//importing necessary packages
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//The Assignment Class is solely responsible for holding data
//Business logic is implemented in differnt files, to separate data and logic
//Thereby it follows Single Responsibility Principle
public class Assignment {
        // Map to associate classrooms with lists of assignments
    private static Map<String, List<String>> classroomAssignmentMap = new HashMap<>();
    

    public static Map<String, List<String>> getClassroomStudentMap() { //getter method for map data
        return classroomAssignmentMap;
    }
    
}
