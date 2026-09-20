package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class c18 {

    /* JADX INFO: renamed from: a */
    public final float f33016a;

    /* JADX INFO: renamed from: b */
    public final float f33017b;

    /* JADX INFO: renamed from: c */
    public final float f33018c;

    /* JADX INFO: renamed from: d */
    public final float f33019d;

    public c18(float f, float f2, float f3, float f4) {
        this.f33016a = f;
        this.f33017b = f2;
        this.f33018c = f3;
        this.f33019d = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c18) {
            c18 c18Var = (c18) obj;
            if (Float.floatToIntBits(this.f33016a) == Float.floatToIntBits(c18Var.f33016a) && Float.floatToIntBits(this.f33017b) == Float.floatToIntBits(c18Var.f33017b) && Float.floatToIntBits(this.f33018c) == Float.floatToIntBits(c18Var.f33018c) && Float.floatToIntBits(this.f33019d) == Float.floatToIntBits(c18Var.f33019d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f33016a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f33017b)) * 1000003) ^ Float.floatToIntBits(this.f33018c)) * 1000003) ^ Float.floatToIntBits(this.f33019d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f33016a + ", maxZoomRatio=" + this.f33017b + ", minZoomRatio=" + this.f33018c + ", linearZoom=" + this.f33019d + "}";
    }
}
