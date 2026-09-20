package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class jd30 implements td30 {

    /* JADX INFO: renamed from: a */
    public final ro0 f111227a;

    /* JADX INFO: renamed from: b */
    public final Set f111228b;

    public jd30(ro0 ro0Var, Set set) {
        this.f111227a = ro0Var;
        this.f111228b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd30)) {
            return false;
        }
        jd30 jd30Var = (jd30) obj;
        return wj50.m88271j(this.f111227a, jd30Var.f111227a) && wj50.m88271j(this.f111228b, jd30Var.f111228b);
    }

    public final int hashCode() {
        return this.f111228b.hashCode() + (this.f111227a.hashCode() * 31);
    }
}
