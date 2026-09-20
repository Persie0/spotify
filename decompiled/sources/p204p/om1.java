package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class om1 implements sn1 {

    /* JADX INFO: renamed from: a */
    public final Set f166956a;

    /* JADX INFO: renamed from: b */
    public final Set f166957b;

    public om1(Set set, Set set2) {
        this.f166956a = set;
        this.f166957b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om1)) {
            return false;
        }
        om1 om1Var = (om1) obj;
        return wj50.m88271j(this.f166956a, om1Var.f166956a) && wj50.m88271j(this.f166957b, om1Var.f166957b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + klh.m56830b(this.f166956a.hashCode() * 31, 31, this.f166957b);
    }
}
