package root;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class IsValidBSTTest {

    public static Collection initData(){
        return Arrays.asList(
                Arguments.of(new TreeNode(10, new TreeNode(5), new TreeNode(12, new TreeNode(10), null)), false),
                Arguments.of(new TreeNode(10, new TreeNode(12, new TreeNode(10), null), new TreeNode(5)), false),
                Arguments.of(new TreeNode(1, new TreeNode(2), new TreeNode(5)), false),
                Arguments.of(new TreeNode(10, new TreeNode(5, new TreeNode(4), new TreeNode(6)), new TreeNode(12, new TreeNode(11), new TreeNode(14))), true),
                Arguments.of(new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7))), false)
        );
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void checkIsValidBST(TreeNode root, boolean expected){
        boolean actual = IsValidBST.isValidBST(root);

        Assert.assertEquals(expected, actual);
    }
}
