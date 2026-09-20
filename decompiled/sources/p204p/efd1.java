package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class efd1 {

    /* JADX INFO: renamed from: a */
    public final e340 f59027a;

    /* JADX INFO: renamed from: b */
    public final aub1 f59028b;

    /* JADX INFO: renamed from: c */
    public final int f59029c;

    public efd1(e340 e340Var, aub1 aub1Var, int i) {
        this.f59027a = e340Var;
        this.f59028b = aub1Var;
        this.f59029c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efd1)) {
            return false;
        }
        efd1 efd1Var = (efd1) obj;
        return this.f59027a.equals(efd1Var.f59027a) && this.f59028b.equals(efd1Var.f59028b) && this.f59029c == efd1Var.f59029c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f59029c) + ((this.f59028b.hashCode() + (this.f59027a.hashCode() * 31)) * 31);
    }
}
