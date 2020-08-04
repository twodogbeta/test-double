package mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SecurityCenterTest {

    @Mock
    private DoorPanel doorPanel;

    @InjectMocks
    private SecurityCenter securityCenter;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(doorPanel).close();
    }
}