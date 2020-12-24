package MultiplicationTable;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {


    @Test
    void getTable() {
        List<String> listCreated = new ArrayList<>();
        listCreated.add("8 X 1 = 8");
        listCreated.add("8 X 2 = 16");
        listCreated.add("8 X 3 = 24");
        listCreated.add("8 X 4 = 32");
        listCreated.add("8 X 5 = 40");
        listCreated.add("8 X 6 = 48");
        listCreated.add("8 X 7 = 56");
        listCreated.add("8 X 8 = 64");
        listCreated.add("8 X 9 = 72");
        listCreated.add("8 X 10 = 80");
        Assert.assertEquals(listCreated, MultiplicationTable.getTable(8));
    }
}