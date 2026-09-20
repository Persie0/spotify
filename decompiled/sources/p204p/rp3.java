package p204p;

import androidx.compose.p002ui.geometry.Offset;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class rp3 {

    /* JADX INFO: renamed from: a */
    public final long f201408a;

    /* JADX INFO: renamed from: b */
    public final yq3 f201409b;

    /* JADX INFO: renamed from: c */
    public final boolean f201410c;

    public rp3(long j, yq3 yq3Var, boolean z) {
        this.f201408a = j;
        this.f201409b = yq3Var;
        this.f201410c = z;
    }

    /* JADX INFO: renamed from: a */
    public static rp3 m76095a(rp3 rp3Var, long j) {
        yq3 yq3Var = rp3Var.f201409b;
        boolean z = rp3Var.f201410c;
        rp3Var.getClass();
        return new rp3(j, yq3Var, z);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m76096b() {
        int iOrdinal = this.f201409b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return this.f201410c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp3)) {
            return false;
        }
        rp3 rp3Var = (rp3) obj;
        return Offset.m253c(this.f201408a, rp3Var.f201408a) && this.f201409b == rp3Var.f201409b && this.f201410c == rp3Var.f201410c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201410c) + ((this.f201409b.hashCode() + (Long.hashCode(this.f201408a) * 31)) * 31);
    }
}
