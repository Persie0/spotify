package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ifd1 {

    /* JADX INFO: renamed from: a */
    public final String f101749a;

    /* JADX INFO: renamed from: b */
    public final b450 f101750b;

    /* JADX INFO: renamed from: c */
    public final int f101751c;

    public ifd1(String str, b450 b450Var, int i) {
        this.f101749a = str;
        this.f101750b = b450Var;
        this.f101751c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifd1)) {
            return false;
        }
        ifd1 ifd1Var = (ifd1) obj;
        return this.f101749a.equals(ifd1Var.f101749a) && this.f101750b.equals(ifd1Var.f101750b) && this.f101751c == ifd1Var.f101751c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101751c) + stz0.m79353g(this.f101749a.hashCode() * 31, 31, this.f101750b);
    }
}
