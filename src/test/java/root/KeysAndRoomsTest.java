package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class KeysAndRoomsTest {

    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3), Arrays.asList()), true),
                Arguments.of(Arrays.asList(Arrays.asList(1, 3), Arrays.asList(3, 0, 1), Arrays.asList(2), Arrays.asList(0)), false));
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkCanVisitAllRooms(List<List<Integer>> arrays, boolean expected){
        boolean actual = KeysAndRooms.canVisitAllRooms(arrays);

        Assert.assertEquals(expected, actual);
    }
}
