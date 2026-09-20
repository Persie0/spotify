package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hh40 implements ih40 {

    /* JADX INFO: renamed from: a */
    public final String f91285a;

    /* JADX INFO: renamed from: b */
    public final qp51 f91286b;

    /* JADX INFO: renamed from: c */
    public final iv50 f91287c;

    public hh40(String str, qp51 qp51Var, iv50 iv50Var) {
        this.f91285a = str;
        this.f91286b = qp51Var;
        this.f91287c = iv50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh40)) {
            return false;
        }
        hh40 hh40Var = (hh40) obj;
        return wj50.m88271j(this.f91285a, hh40Var.f91285a) && wj50.m88271j(this.f91286b, hh40Var.f91286b) && wj50.m88271j(this.f91287c, hh40Var.f91287c);
    }

    public final int hashCode() {
        return this.f91287c.hashCode() + ((this.f91286b.hashCode() + (this.f91285a.hashCode() * 31)) * 31);
    }
}
