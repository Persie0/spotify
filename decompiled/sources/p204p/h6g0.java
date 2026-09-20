package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class h6g0 {

    /* JADX INFO: renamed from: a */
    public final List f88089a;

    /* JADX INFO: renamed from: b */
    public final int f88090b;

    /* JADX INFO: renamed from: c */
    public final boolean f88091c;

    /* JADX INFO: renamed from: d */
    public final int f88092d;

    /* JADX INFO: renamed from: e */
    public final boolean f88093e;

    public h6g0(List list, int i, boolean z, int i2, boolean z2) {
        this.f88089a = list;
        this.f88090b = i;
        this.f88091c = z;
        this.f88092d = i2;
        this.f88093e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6g0)) {
            return false;
        }
        h6g0 h6g0Var = (h6g0) obj;
        return wj50.m88271j(this.f88089a, h6g0Var.f88089a) && this.f88090b == h6g0Var.f88090b && this.f88091c == h6g0Var.f88091c && this.f88092d == h6g0Var.f88092d && this.f88093e == h6g0Var.f88093e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88093e) + mt60.m62800g(this.f88092d, s571.m77245d(mt60.m62800g(this.f88090b, this.f88089a.hashCode() * 31, 31), 31, this.f88091c), 31);
    }
}
