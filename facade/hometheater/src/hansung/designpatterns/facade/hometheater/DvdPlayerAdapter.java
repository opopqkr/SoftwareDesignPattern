package hansung.designpatterns.facade.hometheater;

/**
 * Created by Park Chan mo on 2017-10-19.
 */
public class DvdPlayerAdapter implements DvdPlayer {
    LGDvdPlayer dvdPlayer;

    public DvdPlayerAdapter(LGDvdPlayer dvdPlayer){
        this.dvdPlayer = dvdPlayer;
    }

    @Override
    public void on() {
        dvdPlayer.on();
    }

    @Override
    public void off() {
        dvdPlayer.off();
    }

    @Override
    public void eject() {
        dvdPlayer.eject();
    }

    @Override
    public void play(String movie) {
        dvdPlayer.play();
    }

    @Override
    public void play(int track) {
        if(dvdPlayer.currentTrack < track){
            for(int i = 0; i< (track - dvdPlayer.currentTrack) ; i++) {
                dvdPlayer.next();
            }
        }else{
            for(int i = 0; i< (dvdPlayer.currentTrack - track); i++) {
                dvdPlayer.previous();
            }
        }
        dvdPlayer.play();
    }

    @Override
    public void stop() {
        dvdPlayer.stop();
    }

    @Override
    public void pause() {
        dvdPlayer.pause();
    }

    @Override
    public void setTwoChannelAudio() {
        dvdPlayer.setTwoChannelAudio();
    }

    @Override
    public void setSurroundAudio() {
        throw new UnsupportedOperationException();
    }
}
