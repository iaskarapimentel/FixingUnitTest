package correct;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import main.java.Employee;
import main.java.EmployeeManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestEmpListSize {

	EmployeeManager EM = new EmployeeManager();

	@BeforeEach
    public void init(){
        EM.initialize();
    }

	@Test
	@DisplayName("Correct initial length of Employee List")
    public void testFirstEmployee(){
        assertEquals(3, EM.getEmployeeList().size());
    }


	@Test
	@DisplayName("Incorrect initial length of Employee List")
    public void testEmpListWrongLength(){
        assertNotEquals(2, EM.getEmployeeList().size());
    }

	@Test
	@DisplayName("2 is the Correct Edited Length of Employee List")
    public void testEmpListEditedLength2(){
        EM.getEmployeeList().remove(1);
        assertEquals(2, EM.getEmployeeList().size());
    }

	@Test
	@DisplayName("4 is the Correct Edited length of Employee List")
    public void testEmpListEditedLength4(){
        EM.getEmployeeList().add(null);
        assertEquals(4, EM.getEmployeeList().size());
    }

	@AfterEach
    void clear() {
        EM = null;
    }

}
