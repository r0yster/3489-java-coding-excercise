import java.util.Date;

public class Employee {
    public final class Employee {

        private final String name;
        private final int id;
        private final Date dateHired;
        private final boolean managerFlag;
        private final boolean partTimeFlag;

        public Employee(final String name, final int id, final Date dateHired) {
            this(name, id, dateHired, false, false);
        }

        public Employe(final String name, final int id, final Date dateHired
                        final boolean isManager, final boolean isPartTime) {
            this.name = name;
            this.id = id;
            this.dateHired = dateHired;
            this.managerFlag = isManager;
            this.partTimeFlag = isPartTime;
        }

        // Setters
        public Employee setManager(boolean status) {
            return new Employee(name, id, dateHired, status, isPartTime);
        }

        public Employee setPartTime(boolean status) {
            return new Employee(name, id, dateHired, isManager, status);
        }

        // Getters
        public String getName() {
            return this.name;
        }

        public int getId() {
            return this.id;
        }

        public Date getDateHired() {
            return this.dateHired;
        }

        public boolean isManager() {
            return this.managerFlag;
        }

        public boolean isPartTime() {
            return this.partTimeFlag
        }
    }
}
