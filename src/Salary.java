public class Salary implements Message<Integer>{

    private int salary;
    private String from, to;

    Salary(String from, String to, int salary) {
        this.salary = salary;
        this.from = from;
        this.to = to;
    }

    @Override
    public Integer getContent() {
        return salary;
    }

    public String getTo() {
        return to;
    }

}
