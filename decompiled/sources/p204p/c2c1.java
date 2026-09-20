package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class c2c1 extends i2c1 {

    /* JADX INFO: renamed from: a */
    public final int f33344a;

    /* JADX INFO: renamed from: b */
    public final String f33345b;

    /* JADX INFO: renamed from: c */
    public final String f33346c;

    /* JADX INFO: renamed from: d */
    public final int f33347d;

    public c2c1(int i, String str, int i2, String str2) {
        this.f33344a = i;
        this.f33345b = str;
        this.f33346c = str2;
        this.f33347d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2c1)) {
            return false;
        }
        c2c1 c2c1Var = (c2c1) obj;
        return this.f33344a == c2c1Var.f33344a && wj50.m88271j(this.f33345b, c2c1Var.f33345b) && wj50.m88271j(this.f33346c, c2c1Var.f33346c) && this.f33347d == c2c1Var.f33347d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f33347d) + s571.m77243b(s571.m77243b(Integer.hashCode(this.f33344a) * 31, 31, this.f33345b), 31, this.f33346c);
    }
}
