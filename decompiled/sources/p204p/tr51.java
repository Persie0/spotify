package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tr51 implements moc1 {

    /* JADX INFO: renamed from: a */
    public final int f222983a;

    /* JADX INFO: renamed from: b */
    public final int f222984b;

    /* JADX INFO: renamed from: c */
    public final int f222985c;

    /* JADX INFO: renamed from: d */
    public final boolean f222986d;

    /* JADX INFO: renamed from: e */
    public final boolean f222987e;

    /* JADX INFO: renamed from: f */
    public final mr51 f222988f;

    public tr51(int i, int i2, int i3, boolean z, boolean z2, mr51 mr51Var) {
        this.f222983a = i;
        this.f222984b = i2;
        this.f222985c = i3;
        this.f222986d = z;
        this.f222987e = z2;
        this.f222988f = mr51Var;
    }

    @Override // p204p.moc1
    /* JADX INFO: renamed from: a */
    public final int mo28648a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr51)) {
            return false;
        }
        tr51 tr51Var = (tr51) obj;
        return this.f222983a == tr51Var.f222983a && this.f222984b == tr51Var.f222984b && this.f222985c == tr51Var.f222985c && this.f222986d == tr51Var.f222986d && this.f222987e == tr51Var.f222987e && wj50.m88271j(this.f222988f, tr51Var.f222988f);
    }

    public final int hashCode() {
        return this.f222988f.hashCode() + s571.m77245d(s571.m77245d(mt60.m62800g(this.f222985c, mt60.m62800g(this.f222984b, Integer.hashCode(this.f222983a) * 31, 31), 31), 31, this.f222986d), 31, this.f222987e);
    }
}
