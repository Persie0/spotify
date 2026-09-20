package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class x5d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final String f258389a;

    /* JADX INFO: renamed from: b */
    public final String f258390b;

    public x5d1(String str, String str2) {
        this.f258389a = str;
        this.f258390b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5d1)) {
            return false;
        }
        x5d1 x5d1Var = (x5d1) obj;
        return wj50.m88271j(this.f258389a, x5d1Var.f258389a) && wj50.m88271j(this.f258390b, x5d1Var.f258390b);
    }

    public final int hashCode() {
        return this.f258390b.hashCode() + (this.f258389a.hashCode() * 31);
    }
}
