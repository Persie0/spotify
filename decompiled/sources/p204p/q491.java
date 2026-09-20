package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q491 {

    /* JADX INFO: renamed from: a */
    public final int f185118a;

    /* JADX INFO: renamed from: b */
    public final int f185119b;

    /* JADX INFO: renamed from: c */
    public final int f185120c;

    public q491(int i, int i2, int i3) {
        this.f185118a = i;
        this.f185119b = i2;
        this.f185120c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q491)) {
            return false;
        }
        q491 q491Var = (q491) obj;
        return this.f185118a == q491Var.f185118a && this.f185119b == q491Var.f185119b && this.f185120c == q491Var.f185120c;
    }

    public final int hashCode() {
        return Integer.hashCode(8388611) + mt60.m62800g(this.f185120c, mt60.m62800g(this.f185119b, Integer.hashCode(this.f185118a) * 31, 31), 31);
    }
}
