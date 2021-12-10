package correct;

import static jdk.internal.misc.OSEnvironment.initialize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.java.EmployeeManager;

class TestEmpShuffle {

	EmployeeManager EM = new EmployeeManager();

	@BeforeEach
    public void init(){
        EM.initialize();
    }

	@Test
	@DisplayName("Pre Shuffle: Sham is the first employee")
    public void shamIsTheFirstEmployee(){
        assertEquals("Sham", EM.getEmployeeList().get(0).getName());
    }


	@Test
	@DisplayName("Post Shuffle: Sham is NOT the first employee")
    public void testChangedFirstEmployee(){
        EM.shuffle();
        assertEquals("Bob",  EM.getEmployeeList().get(0).getName());
    }

	@Test
	@DisplayName("Post Shuffle: Sham is the last employee")
    public void testChangedLastEmployee(){
        EM.shuffle();
        assertEquals("Sham", EM.getEmployeeList().get(2).getName());
    }

	@AfterEach
    void clear() {
        EM = null;
    }

}
