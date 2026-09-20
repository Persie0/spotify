package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fpq0 {

    /* JADX INFO: renamed from: a */
    public final q2m0 f71942a;

    /* JADX INFO: renamed from: b */
    public final List f71943b;

    public fpq0(q2m0 q2m0Var, List list) {
        this.f71942a = q2m0Var;
        this.f71943b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpq0)) {
            return false;
        }
        fpq0 fpq0Var = (fpq0) obj;
        return wj50.m88271j(this.f71942a, fpq0Var.f71942a) && wj50.m88271j(this.f71943b, fpq0Var.f71943b);
    }

    public final int hashCode() {
        return this.f71943b.hashCode() + (this.f71942a.hashCode() * 31);
    }
}
