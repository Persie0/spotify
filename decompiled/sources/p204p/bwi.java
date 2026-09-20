package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bwi {

    /* JADX INFO: renamed from: a */
    public final boolean f31658a;

    /* JADX INFO: renamed from: b */
    public final boolean f31659b;

    /* JADX INFO: renamed from: c */
    public final boolean f31660c;

    /* JADX INFO: renamed from: d */
    public final int f31661d;

    /* JADX INFO: renamed from: e */
    public final boolean f31662e;

    /* JADX INFO: renamed from: f */
    public final boolean f31663f;

    public bwi(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
        this.f31658a = z;
        this.f31659b = z2;
        this.f31660c = z3;
        this.f31661d = i;
        this.f31662e = z4;
        this.f31663f = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwi)) {
            return false;
        }
        bwi bwiVar = (bwi) obj;
        return this.f31658a == bwiVar.f31658a && this.f31659b == bwiVar.f31659b && this.f31660c == bwiVar.f31660c && this.f31661d == bwiVar.f31661d && this.f31662e == bwiVar.f31662e && this.f31663f == bwiVar.f31663f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31663f) + s571.m77245d(mt60.m62800g(this.f31661d, s571.m77245d(s571.m77245d(Boolean.hashCode(this.f31658a) * 31, 31, this.f31659b), 31, this.f31660c), 31), 31, this.f31662e);
    }
}
