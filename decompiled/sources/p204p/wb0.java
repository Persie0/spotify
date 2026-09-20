package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wb0 {

    /* JADX INFO: renamed from: a */
    public final xqx0 f249649a;

    /* JADX INFO: renamed from: b */
    public final List f249650b;

    /* JADX INFO: renamed from: c */
    public final vb0 f249651c;

    public wb0(xqx0 xqx0Var, List list, vb0 vb0Var) {
        this.f249649a = xqx0Var;
        this.f249650b = list;
        this.f249651c = vb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb0)) {
            return false;
        }
        wb0 wb0Var = (wb0) obj;
        return wj50.m88271j(this.f249649a, wb0Var.f249649a) && wj50.m88271j(this.f249650b, wb0Var.f249650b) && wj50.m88271j(this.f249651c, wb0Var.f249651c);
    }

    public final int hashCode() {
        return this.f249651c.hashCode() + s571.m77244c(this.f249649a.hashCode() * 31, 31, this.f249650b);
    }
}
