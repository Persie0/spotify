package p204p;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.AudioStream;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class noz implements gz6 {

    /* JADX INFO: renamed from: a */
    public final mqr f156823a;

    /* JADX INFO: renamed from: b */
    public final Handler f156824b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f156825c;

    public noz(mqr mqrVar, Handler handler, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f156823a = mqrVar;
        this.f156824b = handler;
        this.f156825c = copyOnWriteArrayList;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        boolean z;
        AudioStream audioStream;
        wdd0 wdd0Var;
        mqr mqrVar = this.f156823a;
        synchronized (mqrVar.f146343b) {
            qoz qozVar = (qoz) mqrVar.f146344c;
            z = qozVar.f191086a;
            audioStream = qozVar.f191087b;
            wdd0Var = qozVar.f191088c;
        }
        Logger.m3969e("Audio focus change: %d, HasAudioFocus = %b for AudioStreamType %s", Integer.valueOf(i), Boolean.valueOf(z), audioStream);
        if (i == -3) {
            this.f156823a.m62594p(false);
            this.f156824b.post(new ca6(this, !fvg1.m42871n(wdd0Var), 5));
        } else if (i == -2) {
            this.f156823a.m62594p(false);
            this.f156824b.post(new moz(this, 2));
        } else if (i == -1) {
            this.f156823a.m62594p(false);
            this.f156824b.post(new moz(this, 1));
        } else {
            if (i != 1) {
                return;
            }
            this.f156823a.m62594p(true);
            this.f156824b.post(new moz(this, 0));
        }
    }
}
