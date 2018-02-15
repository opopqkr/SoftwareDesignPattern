/**
 * Created by Park Chan mo on 2017-10-21.
 */
public class DvdPlayerAdapter extends LGDvdPlayer implements DvdPlayer {

    public DvdPlayerAdapter(String description, Amplifier amplifier) {
        super(description, amplifier);
    }

    @Override
    public void play(String movie) {
        super.play();
    }

    @Override
    public void play(int track) {
        if(super.currentTrack < track){
            for(int i = 0; i< (track - super.currentTrack) ; i++) {
                super.next();
            }
        }else{
            for(int i = 0; i< (super.currentTrack - track); i++) {
                super.previous();
            }
        }
        super.play();
    }

    @Override
    public void setSurroundAudio() {
        throw new UnsupportedOperationException();
    }
}
