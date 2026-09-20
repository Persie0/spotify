package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a270 {

    /* JADX INFO: renamed from: a */
    public final lzm0 f11586a;

    /* JADX INFO: renamed from: b */
    public final lzm0 f11587b;

    /* JADX INFO: renamed from: c */
    public final b370 f11588c;

    /* JADX INFO: renamed from: d */
    public final d850 f11589d;

    public a270(lzm0 lzm0Var, lzm0 lzm0Var2, b370 b370Var, d850 d850Var) {
        this.f11586a = lzm0Var;
        this.f11587b = lzm0Var2;
        this.f11588c = b370Var;
        this.f11589d = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a270)) {
            return false;
        }
        a270 a270Var = (a270) obj;
        return wj50.m88271j(this.f11586a, a270Var.f11586a) && wj50.m88271j(this.f11587b, a270Var.f11587b) && wj50.m88271j(this.f11588c, a270Var.f11588c) && wj50.m88271j(this.f11589d, a270Var.f11589d);
    }

    public final int hashCode() {
        return this.f11589d.hashCode() + ((this.f11588c.hashCode() + ((this.f11587b.hashCode() + (this.f11586a.hashCode() * 31)) * 31)) * 31);
    }
}
