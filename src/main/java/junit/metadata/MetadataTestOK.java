package junit.metadata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MetadataTestOK {

    @Test
    @TFMetadata( key = "first_KEY", value = {"first_VALUE"})
    public void keyValue(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "solo_KEY")
    public void keyOnly(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "multi_KEY", value = {"first_LIST", "second_LIST", "third_LIST"})
    public void keyMultilineValue(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "first_KEY", value = {"first_VALUE"})
    @TFMetadata( key = "solo")
    @TFMetadata( key = "list", value = {"first_item", "second_item", "third,_item"})
    public void multiAnnot(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "1111", value = {"22222"})
    @TFMetadata( key = "3333")
    @TFMetadata( key = "5555", value = {"6666", "7777", "8888"})
    public void numbersEverywhere(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

    @Test
    @TFMetadata( key = "first_K-E.Y", value = {"first_VALUE"})
    @TFMetadata( key = "se.con-d_KEY")
    @TFMetadata( key = "mu.l-ti_Key", value = {"one", "two", "three"})
    @TFMetadata( key = "first", value = {"fi/r-s.t_VALUE"})
    @TFMetadata( key = "second", value = {"o/ne", "t.wo", "t-hr_ee"})
    public void specialChar(){
        int a = 2;
        int b = 2;
        Assertions.assertEquals(a, b);
    }

}
