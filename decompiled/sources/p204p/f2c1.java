package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class f2c1 extends i2c1 {

    /* JADX INFO: renamed from: a */
    public final int f65148a;

    /* JADX INFO: renamed from: b */
    public final String f65149b;

    /* JADX INFO: renamed from: c */
    public final String f65150c;

    public f2c1(int i, String str, String str2) {
        this.f65148a = i;
        this.f65149b = str;
        this.f65150c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2c1)) {
            return false;
        }
        f2c1 f2c1Var = (f2c1) obj;
        return this.f65148a == f2c1Var.f65148a && wj50.m88271j(this.f65149b, f2c1Var.f65149b) && wj50.m88271j(this.f65150c, f2c1Var.f65150c);
    }

    public final int hashCode() {
        return this.f65150c.hashCode() + s571.m77243b(Integer.hashCode(this.f65148a) * 31, 31, this.f65149b);
    }
}
