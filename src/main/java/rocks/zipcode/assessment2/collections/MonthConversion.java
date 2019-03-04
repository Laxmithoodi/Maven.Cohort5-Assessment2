package rocks.zipcode.assessment2.collections;

import java.text.DateFormatSymbols;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private Integer monthNumber;
    private Integer monthName;

    Map<Integer, String> month = new TreeMap<Integer, String>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {

        month.put(monthNumber, monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return new DateFormatSymbols().getMonths()[monthNumber-1];

//        Month m = Month.of(monthNumber);
//        month.get(m);
      //  throw new NullPointerException();
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {

        return Integer.parseInt(new DateFormatSymbols().getMonths()[Integer.parseInt(monthName)]);
//       Month  m = Month.valueOf(monthName);
//        return m.ordinal();

    // return Integer.parseInt(String.valueOf(Month.valueOf(monthName)));


       // return (Integer)null;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if(month.containsKey(monthNumber)){
            return true;
        }else
            return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if(month.containsValue(monthName)){
            return true;
        }else


        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {

        return month.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {

        month.replace(monthNumber, monthName);

    }
}
