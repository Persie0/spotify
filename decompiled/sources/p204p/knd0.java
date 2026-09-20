package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class knd0 {

    /* JADX INFO: renamed from: a */
    public final e340 f124390a;

    /* JADX INFO: renamed from: b */
    public final aub1 f124391b;

    /* JADX INFO: renamed from: c */
    public final int f124392c;

    public knd0(e340 e340Var, aub1 aub1Var, int i) {
        this.f124390a = e340Var;
        this.f124391b = aub1Var;
        this.f124392c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knd0)) {
            return false;
        }
        knd0 knd0Var = (knd0) obj;
        return this.f124390a.equals(knd0Var.f124390a) && this.f124391b.equals(knd0Var.f124391b) && this.f124392c == knd0Var.f124392c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f124392c) + ((this.f124391b.hashCode() + (this.f124390a.hashCode() * 31)) * 31);
    }
}
