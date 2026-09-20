package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class nd10 {

    /* JADX INFO: renamed from: a */
    public final int f152634a;

    /* JADX INFO: renamed from: b */
    public final int f152635b;

    /* JADX INFO: renamed from: c */
    public final String f152636c;

    public nd10(int i, int i2, String str) {
        this.f152634a = i;
        this.f152635b = i2;
        this.f152636c = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m64190a() {
        return this.f152634a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd10)) {
            return false;
        }
        nd10 nd10Var = (nd10) obj;
        return this.f152634a == nd10Var.f152634a && this.f152635b == nd10Var.f152635b && wj50.m88271j(this.f152636c, nd10Var.f152636c);
    }

    public final int hashCode() {
        return this.f152636c.hashCode() + mt60.m62800g(this.f152635b, mt60.m62800g(this.f152634a, -1487053605, 31), 31);
    }
}
