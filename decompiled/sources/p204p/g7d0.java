package p204p;

import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class g7d0 extends e7d0 {

    /* JADX INFO: renamed from: d */
    public final r431 f77245d;

    /* JADX WARN: Illegal instructions before constructor call */
    public g7d0(r431 r431Var) {
        int i;
        String str;
        int iOrdinal = r431Var.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.mediaservice_vector_shuffle;
        } else if (iOrdinal == 1) {
            i = R.drawable.mediaservice_vector_shuffle_active;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.mediaservice_vector_smart_shuffle_v3;
        }
        int iOrdinal2 = r431Var.ordinal();
        if (iOrdinal2 == 0) {
            str = "TURN_SHUFFLE_ON";
        } else if (iOrdinal2 == 1) {
            str = "TURN_SHUFFLE_OFF";
        } else {
            if (iOrdinal2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "TURN_SMART_SHUFFLE_OFF";
        }
        super(i, R.string.toggle_shuffle_label, str);
        this.f77245d = r431Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7d0) && this.f77245d == ((g7d0) obj).f77245d;
    }

    public final int hashCode() {
        return this.f77245d.hashCode();
    }
}
