package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xy01 extends kz01 {

    /* JADX INFO: renamed from: a */
    public final String f267176a;

    /* JADX INFO: renamed from: b */
    public final ku01 f267177b;

    public xy01(String str, ku01 ku01Var) {
        this.f267176a = str;
        this.f267177b = ku01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy01)) {
            return false;
        }
        xy01 xy01Var = (xy01) obj;
        return wj50.m88271j(this.f267176a, xy01Var.f267176a) && wj50.m88271j(this.f267177b, xy01Var.f267177b);
    }

    public final int hashCode() {
        return this.f267177b.f126425a.hashCode() + (this.f267176a.hashCode() * 31);
    }
}
