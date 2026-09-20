package androidx.media3.exoplayer.mediacodec;

import p204p.r300;
import p204p.tad0;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecRenderer$DecoderInitializationException extends Exception {

    /* JADX INFO: renamed from: a */
    public final String f1012a;

    /* JADX INFO: renamed from: b */
    public final boolean f1013b;

    /* JADX INFO: renamed from: c */
    public final tad0 f1014c;

    /* JADX INFO: renamed from: d */
    public final String f1015d;

    public MediaCodecRenderer$DecoderInitializationException(r300 r300Var, MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + r300Var, mediaCodecUtil$DecoderQueryException, r300Var.f195387p, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public MediaCodecRenderer$DecoderInitializationException(String str, Throwable th, String str2, boolean z, tad0 tad0Var, String str3) {
        super(str, th);
        this.f1012a = str2;
        this.f1013b = z;
        this.f1014c = tad0Var;
        this.f1015d = str3;
    }
}
