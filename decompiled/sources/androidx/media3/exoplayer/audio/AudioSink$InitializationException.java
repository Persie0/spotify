package androidx.media3.exoplayer.audio;

import p204p.dq60;
import p204p.r300;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioSink$InitializationException extends Exception {

    /* JADX INFO: renamed from: a */
    public final boolean f988a;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, r300 r300Var, boolean z, AudioOutputProvider$InitializationException audioOutputProvider$InitializationException) {
        StringBuilder sbM36619s = dq60.m36619s(i, i2, "AudioTrack init failed 0 Config(", ", ", ", ");
        sbM36619s.append(i3);
        sbM36619s.append(", ");
        sbM36619s.append(i4);
        sbM36619s.append(") ");
        sbM36619s.append(r300Var);
        sbM36619s.append(z ? " (recoverable)" : "");
        super(sbM36619s.toString(), audioOutputProvider$InitializationException);
        this.f988a = z;
    }
}
