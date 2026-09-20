package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uf01 {

    /* JADX INFO: renamed from: a */
    public final Object f229638a;

    /* JADX INFO: renamed from: b */
    public final tf01 f229639b;

    public uf01(Object obj, tf01 tf01Var) {
        this.f229638a = obj;
        this.f229639b = tf01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf01)) {
            return false;
        }
        uf01 uf01Var = (uf01) obj;
        return wj50.m88271j(this.f229638a, uf01Var.f229638a) && wj50.m88271j(this.f229639b, uf01Var.f229639b);
    }

    public final int hashCode() {
        Object obj = this.f229638a;
        return this.f229639b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
