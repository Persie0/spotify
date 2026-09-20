package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jhq0 {

    /* JADX INFO: renamed from: d */
    public static final jhq0 f112551d = new jhq0(null, 1, false);

    /* JADX INFO: renamed from: a */
    public final d510 f112552a;

    /* JADX INFO: renamed from: b */
    public final int f112553b;

    /* JADX INFO: renamed from: c */
    public final boolean f112554c;

    public jhq0(d510 d510Var, int i, boolean z) {
        this.f112552a = d510Var;
        this.f112553b = i;
        this.f112554c = z;
    }

    /* JADX INFO: renamed from: a */
    public static jhq0 m53429a(jhq0 jhq0Var, d510 d510Var, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            d510Var = jhq0Var.f112552a;
        }
        if ((i2 & 2) != 0) {
            i = jhq0Var.f112553b;
        }
        if ((i2 & 4) != 0) {
            z = jhq0Var.f112554c;
        }
        jhq0Var.getClass();
        return new jhq0(d510Var, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhq0)) {
            return false;
        }
        jhq0 jhq0Var = (jhq0) obj;
        return wj50.m88271j(this.f112552a, jhq0Var.f112552a) && this.f112553b == jhq0Var.f112553b && this.f112554c == jhq0Var.f112554c;
    }

    public final int hashCode() {
        d510 d510Var = this.f112552a;
        return Boolean.hashCode(this.f112554c) + f710.m40938f(this.f112553b, (d510Var == null ? 0 : d510Var.hashCode()) * 31, 31);
    }
}
