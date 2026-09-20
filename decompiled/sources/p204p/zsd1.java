package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zsd1 {

    /* JADX INFO: renamed from: a */
    public final float f285925a;

    /* JADX INFO: renamed from: b */
    public final float f285926b;

    public zsd1(float f, float f2) {
        this.f285925a = f;
        this.f285926b = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m96829a() {
        float f = this.f285925a;
        float f2 = this.f285926b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsd1)) {
            return false;
        }
        zsd1 zsd1Var = (zsd1) obj;
        return Float.compare(this.f285925a, zsd1Var.f285925a) == 0 && Float.compare(this.f285926b, zsd1Var.f285926b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f285926b) + (Float.hashCode(this.f285925a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f285925a);
        sb.append(", y=");
        return ms2.m62684i(sb, this.f285926b, ')');
    }
}
