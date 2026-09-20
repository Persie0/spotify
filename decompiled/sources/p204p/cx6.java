package p204p;

import com.spotify.playbacknative.AudioDriverListener;
import com.spotify.playbacknative.AudioTrackAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class cx6 implements AudioDriverListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42925a;

    /* JADX INFO: renamed from: b */
    public final Object f42926b;

    public /* synthetic */ cx6(Object obj, int i) {
        this.f42925a = i;
        this.f42926b = obj;
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onAudioTrackCreated(AudioTrackAdapter audioTrackAdapter) {
        switch (this.f42925a) {
            case 0:
                ((fx6) this.f42926b).f74258V0.set(audioTrackAdapter);
                break;
        }
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onAudioTrackDestroyed(AudioTrackAdapter audioTrackAdapter) {
        switch (this.f42925a) {
            case 0:
                AtomicReference atomicReference = ((fx6) this.f42926b).f74258V0;
                while (!atomicReference.compareAndSet(audioTrackAdapter, null) && atomicReference.get() == audioTrackAdapter) {
                }
                break;
        }
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onFlushComplete(int i) {
        int i2 = this.f42925a;
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onFlushStart(int i) {
        int i2 = this.f42925a;
    }

    @Override // com.spotify.playbacknative.AudioDriverListener
    public final void onPaused(boolean z, int i) {
        switch (this.f42925a) {
            case 0:
                break;
            default:
                if (!z) {
                    ((xy3) ((oxe) this.f42926b)).m92397b("playback_started");
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m34222a(AudioTrackAdapter audioTrackAdapter) {
    }

    /* JADX INFO: renamed from: b */
    private final void m34223b(AudioTrackAdapter audioTrackAdapter) {
    }

    /* JADX INFO: renamed from: c */
    private final void m34224c(int i) {
    }

    /* JADX INFO: renamed from: d */
    private final void m34225d(int i) {
    }

    /* JADX INFO: renamed from: e */
    private final void m34226e(int i) {
    }

    /* JADX INFO: renamed from: f */
    private final void m34227f(int i) {
    }

    /* JADX INFO: renamed from: g */
    private final void m34228g(int i, boolean z) {
    }
}
