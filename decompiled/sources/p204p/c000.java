package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c000 implements a000 {

    /* JADX INFO: renamed from: a */
    public final float[] f32639a;

    /* JADX INFO: renamed from: b */
    public final float[] f32640b;

    static {
        new uc5(12);
    }

    public c000(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f32639a = fArr;
        this.f32640b = fArr2;
    }

    @Override // p204p.a000
    /* JADX INFO: renamed from: a */
    public final float mo24307a(float f) {
        return uc5.m82738f(f, this.f32640b, this.f32639a);
    }

    @Override // p204p.a000
    /* JADX INFO: renamed from: b */
    public final float mo24308b(float f) {
        return uc5.m82738f(f, this.f32639a, this.f32640b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c000)) {
            return false;
        }
        c000 c000Var = (c000) obj;
        return Arrays.equals(this.f32639a, c000Var.f32639a) && Arrays.equals(this.f32640b, c000Var.f32640b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f32640b) + (Arrays.hashCode(this.f32639a) * 31);
    }

    public final String toString() {
        return "FontScaleConverter{fromSpValues=" + Arrays.toString(this.f32639a) + ", toDpValues=" + Arrays.toString(this.f32640b) + '}';
    }
}
