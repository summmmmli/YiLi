package assignment33;//Q3

public class Professor {
    private String firstName;
    private String lastName;
    private int personalId;
   
    public static class Builder {
        private String firstName;
        private String lastName;
        private int personalId;
        
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public Builder setPersonalId(int personalId) {
            this.personalId = personalId;
            return this;
        }
        
        public Professor build() {
            return new Professor(firstName, lastName, personalId);
        }
    }

    public Professor(String firstName, String lastName, int personalId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getPersonalId() {
        return personalId;
    }
}

class test {
   public static void main(String[] args) {
        Professor professor = new Professor.Builder("Albert", "Einstein")
                .setPersonalId(0001).build();
    }
}