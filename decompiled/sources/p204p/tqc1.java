package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tqc1 {

    /* JADX INFO: renamed from: a */
    public final int f222791a;

    /* JADX INFO: renamed from: b */
    public final int f222792b;

    /* JADX INFO: renamed from: c */
    public final String f222793c;

    public tqc1(int i, int i2, String str) {
        this.f222791a = i;
        this.f222792b = i2;
        this.f222793c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqc1)) {
            return false;
        }
        tqc1 tqc1Var = (tqc1) obj;
        return this.f222791a == tqc1Var.f222791a && this.f222792b == tqc1Var.f222792b && wj50.m88271j(this.f222793c, tqc1Var.f222793c);
    }

    public final int hashCode() {
        return this.f222793c.hashCode() + mt60.m62800g(this.f222792b, Integer.hashCode(this.f222791a) * 31, 31);
    }
}
