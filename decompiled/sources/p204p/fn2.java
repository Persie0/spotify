package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fn2 {

    /* JADX INFO: renamed from: a */
    public final int f71151a;

    /* JADX INFO: renamed from: b */
    public final int f71152b;

    /* JADX INFO: renamed from: c */
    public final boolean f71153c;

    /* JADX INFO: renamed from: d */
    public final float f71154d;

    public fn2(int i, int i2, boolean z) {
        this.f71151a = i;
        this.f71152b = i2;
        this.f71153c = z;
        this.f71154d = (float) Math.atan2(i2 - 1.5f, i - 1.5f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn2)) {
            return false;
        }
        fn2 fn2Var = (fn2) obj;
        return this.f71151a == fn2Var.f71151a && this.f71152b == fn2Var.f71152b && this.f71153c == fn2Var.f71153c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71153c) + mt60.m62800g(this.f71152b, Integer.hashCode(this.f71151a) * 31, 31);
    }
}
