package androidx.media3.exoplayer.audio;

import p204p.r300;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioSink$ConfigurationException extends Exception {

    /* JADX INFO: renamed from: a */
    public final r300 f987a;

    public AudioSink$ConfigurationException(Exception exc, r300 r300Var) {
        super(exc);
        this.f987a = r300Var;
    }

    public AudioSink$ConfigurationException(String str, r300 r300Var) {
        super(str);
        this.f987a = r300Var;
    }
}
