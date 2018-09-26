
package jsfDemo;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "registration")
@RequestScoped
public class Registration
{
    private String firstName, mi, lastName, gender, major, remarks;
    private String [] minors, hobbies;
    public String getFirstName () {return firstName;}
    public void setFirstName (String firstName) {this.firstName = firstName;}
    public String getMi () {return mi;}
    public void setMi (String mi) {this.mi = mi;}
    public String getLastName () {return lastName;}
    public void setLastName (String lastName) {this.lastName = lastName;}
    public String getGender () {return gender;}
    public void setGender (String gender) {this.gender = gender;}
    public String getMajor () {return major;}
    public void setMajor (String major) {this.major = major;}
    public String getRemarks () {return remarks;}
    public void setRemarks (String remarks) {this.remarks = remarks;}
    public String [] getMinors () {return minors;}
    public void setMinors (String [] minors) {this.minors = minors;}
    public String [] getHobbies () {return hobbies;}
    public void setHobbies (String [] hobbies) {this.hobbies = hobbies;}
    public String getResponse ()
    {
        if (lastName == null)
           return "";
        else
        {
            String allMinors = "Minors:<br/>", allHobbies = "Hobbies:<br/>";
            for (int i = 0; i < minors.length; i ++)
                allMinors += minors [i] + "<br/>";
            for (int i = 0; i < hobbies.length; i ++)
                allHobbies += hobbies [i] + "<br/>";
            return "You entered:<br/>" +
                   firstName + " " + mi + " " + lastName + "<br/>" +
                   "Gender: " + gender + "<br/>" +
                   "Major: " + major + "<br/>" +
                   allMinors + allHobbies;
        }

    }

    public Registration() {}
}
