import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CopierShould {
    @Mock
    private ISource iSource;

    private Copier copier;

    @Before
    public void setUp() {
        copier = new Copier(iSource);
    }

    @Test
    public void read_character_from_source() {
        copier.copy();

        verify(iSource, times(1)).getChar();
    }
}
