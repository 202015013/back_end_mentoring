import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumSplitTest {

    @Test
    void main() {
        NumSplit numSplit = new NumSplit();
        //assertThat(numSplit.splitString("1,2")).contains(1,2)
        // ㄴ 모든 원소를 다 입력하지 않아도 성공
        // ㄴ 중복된 값이 있어도 포함만 되어 있으면 성공
        // ㄴ 순서가 바뀌어도 값만 맞으면 성공
        // ㄴ List 에 없는 값을 입력하면 실패


        //assertThat(numSplit.splitString("1,2")).containsExactly(1, 2)
        // ㄴ 순서를 포함해서 전부 일치해야 성공
    }
}