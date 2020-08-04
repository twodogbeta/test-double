package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class SecurityCenterTest {

    public class MockDoorPanel extends DoorPanel {
        private boolean flag = false;

        @Override
        void close() {
            flag = true;
        }

        public boolean getVerifyResult() {
            return flag;
        }
    }
        private SecurityCenter securityCenter;
        private MockDoorPanel mockDoorPanel;

        @BeforeEach
        public void setUp() {
            mockDoorPanel = new MockDoorPanel();
            securityCenter = new SecurityCenter(mockDoorPanel);
        }

        @Test
        public void shouldVerifyDoorIsClosed() {
            securityCenter.switchOn();
            assertTrue(mockDoorPanel.getVerifyResult());
        }
    }
