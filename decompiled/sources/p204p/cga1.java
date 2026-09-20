package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class cga1 {

    /* JADX INFO: renamed from: a */
    public final fi40 f37611a;

    /* JADX INFO: renamed from: b */
    public final Set f37612b;

    public cga1(fi40 fi40Var, Set set) {
        this.f37611a = fi40Var;
        this.f37612b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cga1)) {
            return false;
        }
        cga1 cga1Var = (cga1) obj;
        return wj50.m88271j(this.f37611a, cga1Var.f37611a) && wj50.m88271j(this.f37612b, cga1Var.f37612b);
    }

    public final int hashCode() {
        return this.f37612b.hashCode() + (this.f37611a.hashCode() * 31);
    }
}
