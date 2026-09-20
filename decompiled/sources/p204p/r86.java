package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r86 {

    /* JADX INFO: renamed from: a */
    public final h66 f196716a;

    /* JADX INFO: renamed from: b */
    public final int f196717b;

    /* JADX INFO: renamed from: c */
    public final int f196718c;

    public r86(h66 h66Var, int i, int i2) {
        this.f196716a = h66Var;
        this.f196717b = i;
        this.f196718c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r86)) {
            return false;
        }
        r86 r86Var = (r86) obj;
        return this.f196716a.equals(r86Var.f196716a) && this.f196717b == r86Var.f196717b && this.f196718c == r86Var.f196718c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f196718c) + f710.m40938f(this.f196717b, this.f196716a.hashCode() * 31, 31);
    }
}
