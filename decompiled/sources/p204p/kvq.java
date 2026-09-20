package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kvq {

    /* JADX INFO: renamed from: a */
    public final int f126926a;

    /* JADX INFO: renamed from: b */
    public final int f126927b;

    /* JADX INFO: renamed from: c */
    public final int f126928c;

    public kvq(int i, int i2, int i3) {
        this.f126926a = i;
        this.f126927b = i2;
        this.f126928c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvq)) {
            return false;
        }
        kvq kvqVar = (kvq) obj;
        return this.f126926a == kvqVar.f126926a && this.f126927b == kvqVar.f126927b && this.f126928c == kvqVar.f126928c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f126928c) + mt60.m62800g(this.f126927b, Integer.hashCode(this.f126926a) * 31, 31);
    }
}
