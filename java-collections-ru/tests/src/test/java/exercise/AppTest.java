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
        List<Integer> listFull = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listEmpty = new ArrayList<>();
        int elemQtyNorm = 3;
        int elemQtyExceed = 7;
        assertThat(App.take(listFull, elemQtyNorm)).isEqualTo(1, 2, 3);
        assertThat(App.take(listFull, elemQtyExceed)).isEqalTo(1, 2, 3, 4, 5);
        assertThat(App.take(listFull, 0)).isEqualTo();
        assertThat(App.take(listEmpty, elemQtyNorm)).isEqualTo();
        // END
    }
}
