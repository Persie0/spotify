package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oh31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final Boolean f165330a;

    /* JADX INFO: renamed from: b */
    public final sc31 f165331b;

    public oh31(Boolean bool, sc31 sc31Var) {
        this.f165330a = bool;
        this.f165331b = sc31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh31)) {
            return false;
        }
        oh31 oh31Var = (oh31) obj;
        return wj50.m88271j(this.f165330a, oh31Var.f165330a) && wj50.m88271j(this.f165331b, oh31Var.f165331b);
    }

    public final int hashCode() {
        Boolean bool = this.f165330a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        sc31 sc31Var = this.f165331b;
        return iHashCode + (sc31Var != null ? sc31Var.hashCode() : 0);
    }
}
