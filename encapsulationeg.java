class Employee{
    private int Emp_id;
    public void setEmpId(int emp_id1){
        Emp_id=emp_id1;

    }
    public int getEmpId(){
        return Emp_id;
    }
}
class Company{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setEmpId(101);
        System.out.println(e.getEmpId());
    }
}