package androidx.media3.exoplayer.audio;

import p204p.r300;
import p204p.s571;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioSink$WriteException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f989a;

    /* JADX INFO: renamed from: b */
    public final boolean f990b;

    /* JADX INFO: renamed from: c */
    public final r300 f991c;

    public AudioSink$WriteException(int i, r300 r300Var, boolean z) {
        super(s571.m77246e(i, "AudioTrack write failed: "));
        this.f990b = z;
        this.f989a = i;
        this.f991c = r300Var;
    }
}
