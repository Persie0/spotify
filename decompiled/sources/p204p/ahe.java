package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ahe {

    /* JADX INFO: renamed from: a */
    public final boolean f15676a;

    /* JADX INFO: renamed from: b */
    public final int f15677b;

    /* JADX INFO: renamed from: c */
    public final boolean f15678c;

    public ahe(int i, boolean z, boolean z2) {
        this.f15676a = z;
        this.f15677b = i;
        this.f15678c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static ahe m25928a(ahe aheVar, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? aheVar.f15676a : false;
        int i2 = aheVar.f15677b;
        if ((i & 4) != 0) {
            z = aheVar.f15678c;
        }
        return new ahe(i2, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahe)) {
            return false;
        }
        ahe aheVar = (ahe) obj;
        return this.f15676a == aheVar.f15676a && this.f15677b == aheVar.f15677b && this.f15678c == aheVar.f15678c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15678c) + mt60.m62800g(this.f15677b, Boolean.hashCode(this.f15676a) * 31, 31);
    }
}
