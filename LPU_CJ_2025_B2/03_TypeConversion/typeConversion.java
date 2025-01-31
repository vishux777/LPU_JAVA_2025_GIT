public class typeConversion {
    public static void main(String[] args) {
        //type conversion
        //two types -
            //Implicit type conversion (Widening conversion)
            // - Happens automatically
            // - Converts smaller data type to a larger data type 
            // - there will be no data loss
            // - done by the compiler automatically

            //Explicit type conversion (Narrowing conversion)
            // - require manual casting
            // - converts a larger data type to a smaller data type
            // - this may result in data loss
            // - sone by the programmer 

            // int intVal = 10;

            // long longVal = intVal;
            // double doubleVal = intVal;

            // short shortVal = (short)intVal; //Explicit conversion

            // System.out.println(longVal);


            //Example 2
            // double doubleVal = 77.234;

            // int intVal = (int)doubleVal;


            // System.out.println(intVal);

            //Example 3
            String str = "123";

            int num = Integer.parseInt(str);

            System.out.println(num);
    }
}
