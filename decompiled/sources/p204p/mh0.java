package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mh0 {

    /* JADX INFO: renamed from: a */
    public final int f143678a;

    /* JADX INFO: renamed from: b */
    public final int f143679b;

    /* JADX INFO: renamed from: c */
    public final int f143680c;

    /* JADX INFO: renamed from: d */
    public final int f143681d;

    public mh0(int i, int i2, int i3, int i4) {
        this.f143678a = i;
        this.f143679b = i2;
        this.f143680c = i3;
        this.f143681d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh0)) {
            return false;
        }
        mh0 mh0Var = (mh0) obj;
        return this.f143678a == mh0Var.f143678a && this.f143679b == mh0Var.f143679b && this.f143680c == mh0Var.f143680c && this.f143681d == mh0Var.f143681d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f143681d) + mt60.m62800g(this.f143680c, mt60.m62800g(this.f143679b, Integer.hashCode(this.f143678a) * 31, 31), 31);
    }
}
