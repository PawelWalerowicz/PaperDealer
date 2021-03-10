package com.company.Creators;
import com.company.Products.*;

public class ProductCreator {
    public static Ream reamA4 = new Ream("A4",11.50,2.5,297,210,55,80);
    public static Ream reamA3 = new Ream("A3",18.50,5.1,420,297,55,80);
    public static Roller rollerA3 = new Roller("297mm",19.40,1.2,310,100,100,80);
    public static Roller rollerA2 = new Roller("420mm",24.40,1.7,430,100,100,80);
    public static Roller rollerA1 = new Roller("594mm",29.90,2.4,610,100,100,80);
    public static Roller rollerA0 = new Roller("840mm",38.90,3.4,850,100,100,80);

}
