package p204p;

/* JADX INFO: renamed from: p.lz */
/* JADX INFO: loaded from: classes8.dex */
public final class C2108lz implements j10 {

    /* JADX INFO: renamed from: a */
    public final float f138154a;

    /* JADX INFO: renamed from: b */
    public final int f138155b;

    /* JADX INFO: renamed from: c */
    public final int f138156c;

    /* JADX INFO: renamed from: d */
    public final Integer f138157d;

    public C2108lz(float f, int i, int i2, Integer num) {
        this.f138154a = f;
        this.f138155b = i;
        this.f138156c = i2;
        this.f138157d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2108lz)) {
            return false;
        }
        C2108lz c2108lz = (C2108lz) obj;
        return Float.compare(this.f138154a, c2108lz.f138154a) == 0 && this.f138155b == c2108lz.f138155b && this.f138156c == c2108lz.f138156c && wj50.m88271j(this.f138157d, c2108lz.f138157d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f138156c, mt60.m62800g(this.f138155b, Float.hashCode(this.f138154a) * 31, 31), 31);
        Integer num = this.f138157d;
        return iM62800g + (num == null ? 0 : num.hashCode());
    }
}
