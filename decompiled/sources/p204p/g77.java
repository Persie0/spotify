package p204p;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class g77 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h77 f77197a;

    public g77(h77 h77Var) {
        this.f77197a = h77Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ((i77) this.f77197a.f88360c).f99450j.m63839j(-1, new q95(27));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((i77) this.f77197a.f88360c).f99450j.m63839j(-1, new q95(28));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        ((i77) this.f77197a.f88360c).f99450j.m63839j(-1, new q95(27));
    }
}
