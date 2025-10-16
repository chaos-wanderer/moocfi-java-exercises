public class LiteracyData implements Comparable<LiteracyData> {
    private String country;
    private int year;
    private String gender;
    private double literacyRate;
    
    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    public LiteracyData(String country, int year, String gender, double literacyRate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacyRate;
    }

    @Override
    public String toString() {
        return (country + " (" + year + "), " + gender + ", " + literacyRate);
    }

    @Override
    public int compareTo(LiteracyData compared) {
        if (this.literacyRate < compared.literacyRate) {
            return -1;
        } else if (this.literacyRate > compared.literacyRate) {
            return 1;
        } else {
            return 0;
        }
    }
    
    
}
