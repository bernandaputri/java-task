package JavaTask2.Task1;

public class Education {
    private String elementary;
    private String juniorHigh;
    private String seniorHigh;
    private String underGrad;
    
    public String getElementary() {
        return elementary;
    }
    // public void setElementary(String elementary) {
    //     this.elementary = elementary;
    // }
    public String getJuniorHigh() {
        return juniorHigh;
    }
    // public void setJuniorHigh(String juniorHigh) {
    //     this.juniorHigh = juniorHigh;
    // }
    public String getSeniorHigh() {
        return seniorHigh;
    }
    // public void setSeniorHigh(String seniorHigh) {
    //     this.seniorHigh = seniorHigh;
    // }
    public String getUnderGrad() {
        return underGrad;
    }
    // public void setUnderGrad(String underGrad) {
    //     this.underGrad = underGrad;
    // }

    public Education (String elementary, String juniorHigh, String seniorHigh, String underGrad) {
        this.elementary = elementary;
        this.juniorHigh = juniorHigh;
        this.seniorHigh = seniorHigh;
        this.underGrad = underGrad;
    }
}
