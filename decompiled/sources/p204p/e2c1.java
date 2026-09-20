package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class e2c1 extends i2c1 {

    /* JADX INFO: renamed from: a */
    public final int f55426a;

    /* JADX INFO: renamed from: b */
    public final String f55427b;

    public e2c1(int i, String str) {
        this.f55426a = i;
        this.f55427b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2c1)) {
            return false;
        }
        e2c1 e2c1Var = (e2c1) obj;
        return this.f55426a == e2c1Var.f55426a && wj50.m88271j(this.f55427b, e2c1Var.f55427b);
    }

    public final int hashCode() {
        return this.f55427b.hashCode() + (Integer.hashCode(this.f55426a) * 31);
    }
}
