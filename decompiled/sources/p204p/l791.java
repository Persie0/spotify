package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class l791 {

    /* JADX INFO: renamed from: a */
    public final zl1 f130614a;

    /* JADX INFO: renamed from: b */
    public final Set f130615b;

    public l791(zl1 zl1Var, Set set) {
        this.f130614a = zl1Var;
        this.f130615b = set;
    }

    /* JADX INFO: renamed from: a */
    public final Set m58409a() {
        return this.f130615b;
    }

    /* JADX INFO: renamed from: b */
    public final zl1 m58410b() {
        return this.f130614a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l791)) {
            return false;
        }
        l791 l791Var = (l791) obj;
        return wj50.m88271j(this.f130614a, l791Var.f130614a) && wj50.m88271j(this.f130615b, l791Var.f130615b);
    }

    public final int hashCode() {
        return this.f130615b.hashCode() + (this.f130614a.hashCode() * 31);
    }
}
