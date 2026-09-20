package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pf20 {

    /* JADX INFO: renamed from: a */
    public final boolean f176947a;

    /* JADX INFO: renamed from: b */
    public final kr8 f176948b;

    /* JADX INFO: renamed from: c */
    public final cd00 f176949c;

    /* JADX INFO: renamed from: d */
    public final List f176950d;

    public pf20(boolean z, kr8 kr8Var, cd00 cd00Var, List list) {
        this.f176947a = z;
        this.f176948b = kr8Var;
        this.f176949c = cd00Var;
        this.f176950d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf20)) {
            return false;
        }
        pf20 pf20Var = (pf20) obj;
        return this.f176947a == pf20Var.f176947a && wj50.m88271j(this.f176948b, pf20Var.f176948b) && wj50.m88271j(this.f176949c, pf20Var.f176949c) && wj50.m88271j(this.f176950d, pf20Var.f176950d);
    }

    public final int hashCode() {
        int iHashCode = (this.f176948b.hashCode() + (Boolean.hashCode(this.f176947a) * 31)) * 31;
        cd00 cd00Var = this.f176949c;
        return this.f176950d.hashCode() + ((iHashCode + (cd00Var == null ? 0 : cd00Var.f36700a.hashCode())) * 31);
    }
}
