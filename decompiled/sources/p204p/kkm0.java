package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class kkm0 {

    /* JADX INFO: renamed from: a */
    public final Set f123631a;

    /* JADX INFO: renamed from: b */
    public final lkm0 f123632b;

    public kkm0(Set set, lkm0 lkm0Var) {
        this.f123631a = set;
        this.f123632b = lkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkm0)) {
            return false;
        }
        kkm0 kkm0Var = (kkm0) obj;
        return wj50.m88271j(this.f123631a, kkm0Var.f123631a) && wj50.m88271j(this.f123632b, kkm0Var.f123632b);
    }

    public final int hashCode() {
        return this.f123632b.hashCode() + (this.f123631a.hashCode() * 31);
    }
}
