package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bvb {

    /* JADX INFO: renamed from: a */
    public final String f31319a;

    /* JADX INFO: renamed from: b */
    public final b450 f31320b;

    /* JADX INFO: renamed from: c */
    public final b450 f31321c;

    public bvb(String str, b450 b450Var, b450 b450Var2) {
        this.f31319a = str;
        this.f31320b = b450Var;
        this.f31321c = b450Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvb)) {
            return false;
        }
        bvb bvbVar = (bvb) obj;
        return wj50.m88271j(this.f31319a, bvbVar.f31319a) && wj50.m88271j(this.f31320b, bvbVar.f31320b) && wj50.m88271j(this.f31321c, bvbVar.f31321c);
    }

    public final int hashCode() {
        return this.f31321c.hashCode() + stz0.m79353g(this.f31319a.hashCode() * 31, 31, this.f31320b);
    }
}
