package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jaq0 {

    /* JADX INFO: renamed from: a */
    public final int f110529a;

    /* JADX INFO: renamed from: b */
    public final int f110530b;

    /* JADX INFO: renamed from: c */
    public final int f110531c;

    /* JADX INFO: renamed from: d */
    public final int f110532d;

    /* JADX INFO: renamed from: e */
    public final float f110533e;

    public jaq0(int i, int i2, int i3, int i4, float f) {
        this.f110529a = i;
        this.f110530b = i2;
        this.f110531c = i3;
        this.f110532d = i4;
        this.f110533e = f;
    }

    /* JADX INFO: renamed from: a */
    public final int m52853a() {
        return this.f110529a;
    }

    /* JADX INFO: renamed from: b */
    public final int m52854b() {
        return this.f110530b;
    }

    /* JADX INFO: renamed from: c */
    public final int m52855c() {
        return this.f110531c;
    }

    /* JADX INFO: renamed from: d */
    public final int m52856d() {
        return this.f110532d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jaq0)) {
            return false;
        }
        jaq0 jaq0Var = (jaq0) obj;
        return this.f110529a == jaq0Var.f110529a && this.f110530b == jaq0Var.f110530b && this.f110531c == jaq0Var.f110531c && this.f110532d == jaq0Var.f110532d && Float.compare(this.f110533e, jaq0Var.f110533e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110533e) + mt60.m62800g(this.f110532d, mt60.m62800g(this.f110531c, mt60.m62800g(this.f110530b, edb.m38547C(this.f110529a) * 31, 31), 31), 31);
    }
}
