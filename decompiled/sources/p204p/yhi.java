package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yhi {

    /* JADX INFO: renamed from: a */
    public final int f272905a;

    /* JADX INFO: renamed from: b */
    public final int f272906b;

    /* JADX INFO: renamed from: c */
    public final int f272907c;

    /* JADX INFO: renamed from: d */
    public final int f272908d;

    public yhi(int i, int i2, int i3, int i4) {
        this.f272905a = i;
        this.f272906b = i2;
        this.f272907c = i3;
        this.f272908d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhi)) {
            return false;
        }
        yhi yhiVar = (yhi) obj;
        return this.f272905a == yhiVar.f272905a && this.f272906b == yhiVar.f272906b && this.f272907c == yhiVar.f272907c && this.f272908d == yhiVar.f272908d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f272908d) + mt60.m62800g(this.f272907c, mt60.m62800g(this.f272906b, Integer.hashCode(this.f272905a) * 31, 31), 31);
    }
}
