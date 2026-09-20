package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wk80 implements a000 {

    /* JADX INFO: renamed from: a */
    public final float f252160a;

    public wk80(float f) {
        this.f252160a = f;
    }

    @Override // p204p.a000
    /* JADX INFO: renamed from: a */
    public final float mo24307a(float f) {
        return f / this.f252160a;
    }

    @Override // p204p.a000
    /* JADX INFO: renamed from: b */
    public final float mo24308b(float f) {
        return f * this.f252160a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk80) && Float.compare(this.f252160a, ((wk80) obj).f252160a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f252160a);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f252160a, ')');
    }
}
