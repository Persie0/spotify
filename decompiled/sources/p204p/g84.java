package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g84 {

    /* JADX INFO: renamed from: a */
    public static final float[] f77404a = new float[101];

    /* JADX INFO: renamed from: b */
    public static final float[] f77405b = new float[101];

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = 0.0f;
        int i = 0;
        float f12 = 0.0f;
        while (true) {
            float f13 = 1.0f;
            if (i >= 100) {
                f77405b[100] = 1.0f;
                f77404a[100] = 1.0f;
                return;
            }
            float f14 = i / 100;
            float f15 = 1.0f;
            while (true) {
                f = ((f15 - f11) / 2.0f) + f11;
                f2 = f13 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float fM62680e = ms2.m62680e(f, 0.35000002f, f2 * 0.175f, f3) + f4;
                f5 = f13;
                f6 = f14;
                if (Math.abs(fM62680e - f14) < 1.0E-5d) {
                    break;
                }
                if (fM62680e > f6) {
                    f15 = f;
                } else {
                    f11 = f;
                }
                f13 = f5;
                f14 = f6;
            }
            f77404a[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f16 = f5;
            while (true) {
                f7 = ((f16 - f12) / 2.0f) + f12;
                f8 = f5 - f7;
                f9 = f7 * 3.0f * f8;
                f10 = f7 * f7 * f7;
                float fM62680e2 = ms2.m62680e(f8, 0.5f, f7, f9) + f10;
                if (Math.abs(fM62680e2 - f6) >= 1.0E-5d) {
                    if (fM62680e2 > f6) {
                        f16 = f7;
                    } else {
                        f12 = f7;
                    }
                }
            }
            f77405b[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m43944a(float f) {
        float fM38555d;
        float f2;
        float f3 = 100;
        int i = (int) (f3 * f);
        if (i < 100) {
            float f4 = i / f3;
            int i2 = i + 1;
            float f5 = i2 / f3;
            float[] fArr = f77404a;
            float f6 = fArr[i];
            f2 = (fArr[i2] - f6) / (f5 - f4);
            fM38555d = edb.m38555d(f, f4, f2, f6);
        } else {
            fM38555d = 1.0f;
            f2 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(fM38555d) << 32);
    }
}
