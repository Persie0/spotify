package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class srx0 {

    /* JADX INFO: renamed from: a */
    public final List f213428a;

    /* JADX INFO: renamed from: b */
    public final boolean f213429b;

    /* JADX INFO: renamed from: c */
    public final Map f213430c;

    /* JADX INFO: renamed from: d */
    public final long f213431d;

    /* JADX INFO: renamed from: e */
    public final boolean f213432e;

    public /* synthetic */ srx0(List list, boolean z) {
        this(list, z, nau.f152117a, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srx0)) {
            return false;
        }
        srx0 srx0Var = (srx0) obj;
        return wj50.m88271j(this.f213428a, srx0Var.f213428a) && this.f213429b == srx0Var.f213429b && wj50.m88271j(this.f213430c, srx0Var.f213430c) && this.f213431d == srx0Var.f213431d && this.f213432e == srx0Var.f213432e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213432e) + dq60.m36605e(edb.m38557f(s571.m77245d(this.f213428a.hashCode() * 31, 31, this.f213429b), 31, this.f213430c), this.f213431d, 31);
    }

    public srx0(List list, boolean z, Map map, long j, boolean z2) {
        this.f213428a = list;
        this.f213429b = z;
        this.f213430c = map;
        this.f213431d = j;
        this.f213432e = z2;
    }
}
