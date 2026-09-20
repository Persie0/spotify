package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p5d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final int f174151a;

    /* JADX INFO: renamed from: b */
    public final String f174152b;

    public p5d1(int i, String str) {
        this.f174151a = i;
        this.f174152b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5d1)) {
            return false;
        }
        p5d1 p5d1Var = (p5d1) obj;
        return this.f174151a == p5d1Var.f174151a && wj50.m88271j(this.f174152b, p5d1Var.f174152b);
    }

    public final int hashCode() {
        return this.f174152b.hashCode() + (Integer.hashCode(this.f174151a) * 31);
    }
}
