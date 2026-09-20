package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nxw extends e2x {

    /* JADX INFO: renamed from: a */
    public final String f159624a;

    /* JADX INFO: renamed from: b */
    public final d850 f159625b;

    public nxw(String str, d850 d850Var) {
        this.f159624a = str;
        this.f159625b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxw)) {
            return false;
        }
        nxw nxwVar = (nxw) obj;
        return wj50.m88271j(this.f159624a, nxwVar.f159624a) && wj50.m88271j(this.f159625b, nxwVar.f159625b);
    }

    public final int hashCode() {
        return this.f159625b.hashCode() + (this.f159624a.hashCode() * 31);
    }
}
