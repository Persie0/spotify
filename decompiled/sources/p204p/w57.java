package p204p;

import com.spotify.playbacknative.AudioDriverListener;
import com.spotify.playbacknative.AudioTrackAdapter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w57 implements AudioDriverListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x57 f248013a;

    public w57(x57 x57Var) {
        this.f248013a = x57Var;
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onAudioTrackCreated(AudioTrackAdapter audioTrackAdapter) {
        this.f248013a.f258322b.set(audioTrackAdapter.getAudioSessionId());
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onAudioTrackDestroyed(AudioTrackAdapter audioTrackAdapter) {
        this.f248013a.f258322b.compareAndSet(audioTrackAdapter.getAudioSessionId(), 0);
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onPaused(boolean z, int i) {
        x57 x57Var = this.f248013a;
        int i2 = x57Var.f258322b.get();
        if (i2 == i || i2 == 0) {
            Iterator it = x57Var.f258323c.iterator();
            while (it.hasNext()) {
                z57 z57Var = ((y57) it.next()).f269367a;
                z57Var.f279490d = z;
                z57Var.f279488b.onNext(z || z57Var.f279491e ? nw6.f159030b : nw6.f159029a);
            }
        }
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onFlushComplete(int i) {
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onFlushStart(int i) {
    }
}
