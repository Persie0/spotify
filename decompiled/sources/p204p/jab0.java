package p204p;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class jab0 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kab0 f110427a;

    public jab0(kab0 kab0Var) {
        this.f110427a = kab0Var;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f110427a.f120857b.getClass();
        return bundle;
    }
}
