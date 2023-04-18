package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> listFull = new ArrayList<>(1, 2, 3, 4, 5);
        List<Integer> listEmpty = new ArrayList<>();
        int elemQtyNorm = 3;
        int elemQtyExceed = 7;
        assertThat(take(listFull, elemQtyNorm)).isEqualTo(1, 2, 3);
        assertThat(take(listFull, elemQtyExceed)).isEqalTo(1, 2, 3, 4, 5);
        assertThat(take(listFull, 0)).isEmpty;
        assertThat(take(listEmpty, elemQtyNorm)).isEmpty;
        // END
    }
}
