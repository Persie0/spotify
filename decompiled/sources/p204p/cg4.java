package p204p;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes6.dex */
public final class cg4 implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaPlayer f37549a;

    public cg4(MediaPlayer mediaPlayer) {
        this.f37549a = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f37549a.start();
    }
}
