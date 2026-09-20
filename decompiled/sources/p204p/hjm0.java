package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hjm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f92200a;

    /* JADX INFO: renamed from: b */
    public final String f92201b;

    /* JADX INFO: renamed from: c */
    public final gkm0 f92202c;

    public hjm0(String str, String str2, gkm0 gkm0Var) {
        this.f92200a = str;
        this.f92201b = str2;
        this.f92202c = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjm0)) {
            return false;
        }
        hjm0 hjm0Var = (hjm0) obj;
        return wj50.m88271j(this.f92200a, hjm0Var.f92200a) && wj50.m88271j(this.f92201b, hjm0Var.f92201b) && wj50.m88271j(this.f92202c, hjm0Var.f92202c);
    }

    public final int hashCode() {
        return this.f92202c.hashCode() + s571.m77243b(this.f92200a.hashCode() * 31, 31, this.f92201b);
    }
}
