package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kni0 {

    /* JADX INFO: renamed from: a */
    public final v140 f124427a;

    /* JADX INFO: renamed from: b */
    public final erc1 f124428b;

    /* JADX INFO: renamed from: c */
    public final daj f124429c;

    /* JADX INFO: renamed from: d */
    public final v1p0 f124430d;

    public kni0(v140 v140Var, erc1 erc1Var, daj dajVar, v1p0 v1p0Var) {
        this.f124427a = v140Var;
        this.f124428b = erc1Var;
        this.f124429c = dajVar;
        this.f124430d = v1p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kni0)) {
            return false;
        }
        kni0 kni0Var = (kni0) obj;
        return wj50.m88271j(this.f124427a, kni0Var.f124427a) && wj50.m88271j(this.f124428b, kni0Var.f124428b) && wj50.m88271j(this.f124429c, kni0Var.f124429c) && wj50.m88271j(this.f124430d, kni0Var.f124430d);
    }

    public final int hashCode() {
        return this.f124430d.hashCode() + ((this.f124429c.hashCode() + ((this.f124428b.hashCode() + (this.f124427a.hashCode() * 31)) * 31)) * 31);
    }
}
