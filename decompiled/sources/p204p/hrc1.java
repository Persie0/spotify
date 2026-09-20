package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class hrc1 {

    /* JADX INFO: renamed from: a */
    public final long f94405a;

    /* JADX INFO: renamed from: b */
    public final long f94406b;

    /* JADX INFO: renamed from: c */
    public final List f94407c;

    /* JADX INFO: renamed from: d */
    public final boolean f94408d;

    /* JADX INFO: renamed from: e */
    public final boolean f94409e;

    public hrc1(long j, long j2, List list, boolean z, boolean z2) {
        this.f94405a = j;
        this.f94406b = j2;
        this.f94407c = list;
        this.f94408d = z;
        this.f94409e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrc1)) {
            return false;
        }
        hrc1 hrc1Var = (hrc1) obj;
        return this.f94405a == hrc1Var.f94405a && this.f94406b == hrc1Var.f94406b && wj50.m88271j(this.f94407c, hrc1Var.f94407c) && this.f94408d == hrc1Var.f94408d && this.f94409e == hrc1Var.f94409e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94409e) + s571.m77245d(s571.m77244c(dq60.m36605e(Long.hashCode(this.f94405a) * 31, this.f94406b, 31), 31, this.f94407c), 31, this.f94408d);
    }
}
