import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CopierShould {
    @Mock
    private ISource iSource;
    @Mock
    private IDestination iDestination;

    private Copier copier;

    @Before
    public void setUp() {
        copier = new Copier(iSource, iDestination);
    }

    @Test
    public void copy_characters_from_source_to_destination() {
        given(iSource.getChar()).willReturn('T','E', 'S', 'T', ' ');

        copier.copy();

        verify(iSource, times(5)).getChar();
        verify(iDestination, times(2)).setChar('T');
        verify(iDestination).setChar('E');
        verify(iDestination).setChar('S');
    }
}
