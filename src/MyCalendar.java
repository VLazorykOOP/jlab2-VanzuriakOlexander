import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class MyCalendar {
    private int dayOfYear;
    private int year;

    public MyCalendar(int dayOfYear, int year) {
        this.dayOfYear = dayOfYear;
        this.year = year;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear = dayOfYear;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public int getDayOfYear() {
        return this.dayOfYear;
    }
    public String findDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);

        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM, EEEE");

        return sdf.format(date);
    }
}
