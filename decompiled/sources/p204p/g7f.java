package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g7f {

    /* JADX INFO: renamed from: a */
    public final int f77255a;

    /* JADX INFO: renamed from: b */
    public final int f77256b;

    /* JADX INFO: renamed from: c */
    public final int f77257c;

    public g7f(int i, int i2, int i3) {
        this.f77255a = i;
        this.f77256b = i2;
        this.f77257c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7f)) {
            return false;
        }
        g7f g7fVar = (g7f) obj;
        return this.f77255a == g7fVar.f77255a && this.f77256b == g7fVar.f77256b && this.f77257c == g7fVar.f77257c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f77257c) + mt60.m62800g(this.f77256b, Integer.hashCode(this.f77255a) * 31, 31);
    }
}
