package lambda;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void testSortingByNameWithComparator() {
        List<Employee> employees = Lists.newArrayList(
                new Employee("Katie", 30),
                new Employee("Jason", 35)
        );
        Collections.sort(employees, Employee.getSortingByNameWithComparator());
        assertThat(employees.get(0), equalTo(new Employee("Jason", 35)));
    }

    @Test
    public void testSortingByNameWithLambdaFunction() {
        List<Employee> employees = Lists.newArrayList(
                new Employee("Katie", 30),
                new Employee("Jason", 35)
        );
        employees.sort(Employee.getSortingByNameWithLamdbaFunction());
        assertThat(employees.get(0), equalTo(new Employee("Jason", 35)));
    }

    @Test
    public void testSortingByNameAndAge() {
        // TODO: Build your test case
        List<Employee> employees = Lists.newArrayList(
                new Employee("Katie", 30),
                new Employee("Jason", 35),
                new Employee("Jason", 32)
        );
        employees.sort(Employee.getSortingByNameAndAge());
        assertThat(employees.get(0), equalTo(new Employee("Jason", 32)));
        assertThat(employees.get(1), equalTo(new Employee("Jason", 35)));
    }
}