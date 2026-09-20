package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vb0 {

    /* JADX INFO: renamed from: a */
    public final xqx0 f239350a;

    /* JADX INFO: renamed from: b */
    public final int f239351b;

    /* JADX INFO: renamed from: c */
    public final String f239352c;

    /* JADX INFO: renamed from: d */
    public final List f239353d;

    /* JADX INFO: renamed from: e */
    public final ub0 f239354e;

    public vb0(xqx0 xqx0Var, int i, String str, List list, ub0 ub0Var) {
        this.f239350a = xqx0Var;
        this.f239351b = i;
        this.f239352c = str;
        this.f239353d = list;
        this.f239354e = ub0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb0)) {
            return false;
        }
        vb0 vb0Var = (vb0) obj;
        return wj50.m88271j(this.f239350a, vb0Var.f239350a) && this.f239351b == vb0Var.f239351b && wj50.m88271j(this.f239352c, vb0Var.f239352c) && wj50.m88271j(this.f239353d, vb0Var.f239353d) && wj50.m88271j(this.f239354e, vb0Var.f239354e);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(s571.m77243b(mt60.m62800g(this.f239351b, this.f239350a.hashCode() * 31, 31), 31, this.f239352c), 31, this.f239353d);
        ub0 ub0Var = this.f239354e;
        return iM77244c + (ub0Var == null ? 0 : ub0Var.hashCode());
    }
}
