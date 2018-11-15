package bbx.nguyenhung.com.bai9;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MediaPlayerService extends Service {
    MediaPlayer myMediaPlayer;

    @Override
    public void onCreate() {
        super.onCreate();
        myMediaPlayer = MediaPlayer.create(this, R.raw.fakelove);
        myMediaPlayer.setLooping(true);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        myMediaPlayer.stop();
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        myMediaPlayer.start();
    }
}
