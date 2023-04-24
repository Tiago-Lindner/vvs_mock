package dev.ifrs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
//import java.util.ArrayList;
//import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class VolumeTest {

// 1 - Crie um mock da classe AudioManager
@Mock
AudioManager audioManager;


// 2 - injete um mock da classe VolumeUtil
@InjectMocks
VolumeUtil volumeUtil = new VolumeUtil();


    @Test
    public void testAudioManagerSetVolume() {

        // 3 - realize uma chamada para o método maximizeVolume do objeto VolumeUtil
        volumeUtil.maximizeVolume(3);
        // 4 - Verifique se o método setVolume foi chamado uma única vez
        verify(audioManager, times(1)).setVolume(3);
        
    
    }

}
