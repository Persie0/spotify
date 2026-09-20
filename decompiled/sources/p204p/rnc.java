package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rnc {

    /* JADX INFO: renamed from: a */
    public final int f200882a;

    /* JADX INFO: renamed from: b */
    public final int f200883b;

    /* JADX INFO: renamed from: c */
    public final float[] f200884c;

    /* JADX INFO: renamed from: d */
    public final boolean f200885d;

    /* JADX INFO: renamed from: e */
    public final boolean f200886e;

    public rnc(int i, int i2, float[] fArr) {
        boolean z = false;
        c95.m31844j(i > 0, "Input channel count must be positive.");
        c95.m31844j(i2 > 0, "Output channel count must be positive.");
        c95.m31844j(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.f200882a = i;
        this.f200883b = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < 0.0f) {
                throw new IllegalArgumentException(edb.m38563l("Coefficient at index ", i3, " is negative."));
            }
        }
        this.f200884c = fArr;
        int i4 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        while (i4 < i) {
            int i5 = 0;
            while (i5 < i2) {
                float f = this.f200884c[(this.f200883b * i4) + i5];
                boolean z5 = i4 == i5;
                if (f != 1.0f && z5) {
                    z4 = false;
                }
                if (f != 0.0f) {
                    z2 = false;
                    if (!z5) {
                        z3 = false;
                    }
                }
                i5++;
            }
            i4++;
        }
        this.f200885d = z2;
        if (this.f200882a == this.f200883b && z3 && z4) {
            z = true;
        }
        this.f200886e = z;
    }

    /* JADX INFO: renamed from: a */
    public static rnc m75999a(int i, int i2) {
        float[] fArr;
        if (i == i2) {
            fArr = new float[i2 * i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr[(i2 * i3) + i3] = 1.0f;
            }
        } else if (i == 1 && i2 == 2) {
            fArr = new float[]{1.0f, 1.0f};
        } else {
            if (i != 2 || i2 != 1) {
                throw new UnsupportedOperationException(edb.m38560i(i, i2, "Default channel mixing coefficients for ", "->", " are not yet implemented."));
            }
            fArr = new float[]{0.5f, 0.5f};
        }
        return new rnc(i, i2, fArr);
    }
}
