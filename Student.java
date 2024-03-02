package thanhtoan_2280603288;
public class Student
{
    private int ID;
    private String firstName;
    private String lastName;
    private  float diemToan;
    private  float diemLy;
    private  float diemHoa;
    public Student(int ID, String firstName, String lastName)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public Student(int ID, String firstName, String lastName, float diemToan, float diemLy, float diemHoa)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public int getID()
    {
        return ID;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public float getDiemToan()
    {
        return diemToan;
    }
    public float getDiemLy()
    {
        return diemLy;
    }
    public float getDiemHoa()
    {
        return diemHoa;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setDiemToan(float diemToan)
    {
        this.diemToan = diemToan;
    }
    public void setDiemLy(float diemLy)
    {
        this.diemLy = diemLy;
    }
    public void setDiemHoa(float diemHoa)
    {
        this.diemHoa = diemHoa;
    }
    public  String getName(){
        return  this.getLastName() + " " + this.getFirstName(); }
    public float getDiemTrungBinh(){
        return (this.getDiemToan() + this.getDiemLy() + this.getDiemHoa()) / 3;
    }
    public String toString(){
        return  "Student[ID = "+this.getID()+", Name = "+this.getName()+", ĐTB = "+String.format("%.1f", this.getDiemTrungBinh())+"]";
    }
}
