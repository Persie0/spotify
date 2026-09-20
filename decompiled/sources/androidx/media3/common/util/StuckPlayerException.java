package androidx.media3.common.util;

import p204p.edb;

/* JADX INFO: loaded from: classes3.dex */
public final class StuckPlayerException extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    public final int f969a;

    /* JADX INFO: renamed from: b */
    public final int f970b;

    /* JADX WARN: Illegal instructions before constructor call */
    public StuckPlayerException(int i, int i2) {
        String strM38563l;
        if (i == 0) {
            strM38563l = edb.m38563l("Player stuck buffering and not loading for ", i2, " ms");
        } else if (i == 1) {
            strM38563l = edb.m38563l("Player stuck buffering with no progress for ", i2, " ms");
        } else if (i == 2) {
            strM38563l = edb.m38563l("Player stuck playing with no progress for ", i2, " ms");
        } else if (i == 3) {
            strM38563l = edb.m38563l("Player stuck playing without ending for ", i2, " ms");
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            strM38563l = edb.m38563l("Player stuck suppressed for ", i2, " ms");
        }
        super(strM38563l);
        this.f969a = i;
        this.f970b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StuckPlayerException.class != obj.getClass()) {
            return false;
        }
        StuckPlayerException stuckPlayerException = (StuckPlayerException) obj;
        return this.f969a == stuckPlayerException.f969a && this.f970b == stuckPlayerException.f970b;
    }

    public final int hashCode() {
        return ((527 + this.f969a) * 31) + this.f970b;
    }
}
