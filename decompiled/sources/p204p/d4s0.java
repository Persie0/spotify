package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes11.dex */
public final class d4s0 implements f4s0 {

    /* JADX INFO: renamed from: a */
    public final long f45233a;

    public d4s0(long j) {
        this.f45233a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4s0) && Offset.m253c(this.f45233a, ((d4s0) obj).f45233a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f45233a);
    }
}
