package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mkc0 {

    /* JADX INFO: renamed from: a */
    public final int f144550a;

    /* JADX INFO: renamed from: b */
    public final int f144551b;

    /* JADX INFO: renamed from: c */
    public final int f144552c;

    /* JADX INFO: renamed from: d */
    public final int f144553d;

    public mkc0(int i, int i2, int i3, int i4) {
        this.f144550a = i;
        this.f144551b = i2;
        this.f144552c = i3;
        this.f144553d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkc0)) {
            return false;
        }
        mkc0 mkc0Var = (mkc0) obj;
        return this.f144550a == mkc0Var.f144550a && this.f144551b == mkc0Var.f144551b && this.f144552c == mkc0Var.f144552c && this.f144553d == mkc0Var.f144553d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f144553d) + mt60.m62800g(this.f144552c, mt60.m62800g(this.f144551b, Integer.hashCode(this.f144550a) * 31, 31), 31);
    }
}
