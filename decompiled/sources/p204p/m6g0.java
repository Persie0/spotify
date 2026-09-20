package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class m6g0 {

    /* JADX INFO: renamed from: a */
    public final long f140513a;

    /* JADX INFO: renamed from: b */
    public final int f140514b;

    /* JADX INFO: renamed from: c */
    public final Set f140515c;

    public m6g0(int i, long j, Set set) {
        this.f140513a = j;
        this.f140514b = i;
        this.f140515c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6g0)) {
            return false;
        }
        m6g0 m6g0Var = (m6g0) obj;
        return this.f140513a == m6g0Var.f140513a && this.f140514b == m6g0Var.f140514b && wj50.m88271j(this.f140515c, m6g0Var.f140515c);
    }

    public final int hashCode() {
        return this.f140515c.hashCode() + mt60.m62800g(this.f140514b, Long.hashCode(this.f140513a) * 31, 31);
    }
}
