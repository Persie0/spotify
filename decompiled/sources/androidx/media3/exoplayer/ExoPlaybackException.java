package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.Objects;
import p204p.c95;
import p204p.h0b1;
import p204p.r300;
import p204p.s571;
import p204p.vsd0;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: L0 */
    public final int f977L0;

    /* JADX INFO: renamed from: M0 */
    public final vsd0 f978M0;

    /* JADX INFO: renamed from: N0 */
    public final boolean f979N0;

    /* JADX INFO: renamed from: X */
    public final String f980X;

    /* JADX INFO: renamed from: Y */
    public final int f981Y;

    /* JADX INFO: renamed from: Z */
    public final r300 f982Z;

    /* JADX INFO: renamed from: t */
    public final int f983t;

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    @Override // androidx.media3.common.PlaybackException
    /* JADX INFO: renamed from: a */
    public final boolean mo756a(PlaybackException playbackException) {
        if (!super.mo756a(playbackException)) {
            return false;
        }
        String str = h0b1.f86200a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.f983t == exoPlaybackException.f983t && Objects.equals(this.f980X, exoPlaybackException.f980X) && this.f981Y == exoPlaybackException.f981Y && Objects.equals(this.f982Z, exoPlaybackException.f982Z) && this.f977L0 == exoPlaybackException.f977L0 && Objects.equals(this.f978M0, exoPlaybackException.f978M0) && this.f979N0 == exoPlaybackException.f979N0;
    }

    /* JADX INFO: renamed from: b */
    public final ExoPlaybackException m759b(vsd0 vsd0Var) {
        String message = getMessage();
        String str = h0b1.f86200a;
        return new ExoPlaybackException(message, getCause(), this.f965a, this.f983t, this.f980X, this.f981Y, this.f982Z, this.f977L0, vsd0Var, this.f966b, this.f979N0);
    }

    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, r300 r300Var, int i4, vsd0 vsd0Var, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        c95.m31843i(!z || i2 == 1);
        c95.m31843i(th != null || i2 == 3);
        this.f983t = i2;
        this.f980X = str2;
        this.f981Y = i3;
        this.f982Z = r300Var;
        this.f977L0 = i4;
        this.f978M0 = vsd0Var;
        this.f979N0 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Exception exc, int i2, String str, int i3, r300 r300Var, int i4, vsd0 vsd0Var, boolean z) {
        String str2;
        int i5;
        r300 r300Var2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            r300Var2 = r300Var;
            string = "Source error";
        } else if (i != 1) {
            if (i != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i5 = i3;
            r300Var2 = r300Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            r300Var2 = r300Var;
            sb.append(r300Var2);
            sb.append(", format_supported=");
            String str4 = h0b1.f86200a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i4 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : s571.m77250i(string, ": null"), exc, i2, i, str2, i5, r300Var2, i4, vsd0Var, SystemClock.elapsedRealtime(), z);
    }
}
