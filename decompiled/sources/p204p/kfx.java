package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kfx {

    /* JADX INFO: renamed from: a */
    public final int f122236a;

    /* JADX INFO: renamed from: b */
    public final int f122237b;

    /* JADX INFO: renamed from: c */
    public final int f122238c;

    public kfx(int i, int i2, int i3) {
        this.f122236a = i;
        this.f122237b = i2;
        this.f122238c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfx)) {
            return false;
        }
        kfx kfxVar = (kfx) obj;
        return this.f122236a == kfxVar.f122236a && this.f122237b == kfxVar.f122237b && this.f122238c == kfxVar.f122238c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f122238c) + mt60.m62800g(this.f122237b, Integer.hashCode(this.f122236a) * 31, 31);
    }
}
