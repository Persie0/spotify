package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ilv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f103500a;

    /* JADX INFO: renamed from: b */
    public final int f103501b;

    /* JADX INFO: renamed from: c */
    public final Map f103502c;

    /* JADX INFO: renamed from: d */
    public final dpx f103503d;

    public ilv0(boolean z, int i, Map map, dpx dpxVar) {
        this.f103500a = z;
        this.f103501b = i;
        this.f103502c = map;
        this.f103503d = dpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilv0)) {
            return false;
        }
        ilv0 ilv0Var = (ilv0) obj;
        return this.f103500a == ilv0Var.f103500a && this.f103501b == ilv0Var.f103501b && wj50.m88271j(this.f103502c, ilv0Var.f103502c) && wj50.m88271j(this.f103503d, ilv0Var.f103503d);
    }

    public final int hashCode() {
        return this.f103503d.hashCode() + edb.m38557f(mt60.m62800g(this.f103501b, Boolean.hashCode(this.f103500a) * 31, 31), 31, this.f103502c);
    }
}
