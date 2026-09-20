package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import p204p.tad0;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a */
    public final int f1011a;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, tad0 tad0Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(tad0Var == null ? null : tad0Var.f218544a);
        super(sb.toString(), illegalStateException);
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f1011a = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
