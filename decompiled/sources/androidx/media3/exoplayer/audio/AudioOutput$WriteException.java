package androidx.media3.exoplayer.audio;

import p204p.s571;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioOutput$WriteException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f985a;

    /* JADX INFO: renamed from: b */
    public final boolean f986b;

    public AudioOutput$WriteException(int i, boolean z) {
        super(s571.m77246e(i, "AudioOutput write failed: "));
        this.f986b = z;
        this.f985a = i;
    }
}
