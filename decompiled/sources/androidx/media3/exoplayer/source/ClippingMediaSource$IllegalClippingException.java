package androidx.media3.exoplayer.source;

import java.io.IOException;
import p204p.c95;

/* JADX INFO: loaded from: classes3.dex */
public final class ClippingMediaSource$IllegalClippingException extends IOException {
    public ClippingMediaSource$IllegalClippingException(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }

    public ClippingMediaSource$IllegalClippingException(int i, long j, long j2) {
        String str;
        StringBuilder sb = new StringBuilder("Illegal clipping: ");
        if (i != 0) {
            if (i == 1) {
                str = "not seekable to start";
            } else if (i != 2) {
                str = "unknown";
            } else {
                c95.m31855u((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j + ", End time: " + j2;
            }
        } else {
            str = "invalid period count";
        }
        sb.append(str);
        super(sb.toString());
    }
}
