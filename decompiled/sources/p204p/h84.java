package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h84 {

    /* JADX INFO: renamed from: a */
    public static final float[] f88615a;

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
        float[] fArr = new float[101];
        f88615a = fArr;
        float[] fArr2 = new float[101];
        float f10 = 0.0f;
        int i = 0;
        float f11 = 0.0f;
        while (true) {
            float f12 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f13 = i / 100;
            float f14 = 1.0f;
            while (true) {
                f = ((f14 - f10) / 2.0f) + f10;
                f2 = f12 - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float fM62680e = ms2.m62680e(f, 0.35000002f, f2 * 0.175f, f3) + f4;
                f5 = f12;
                if (Math.abs(fM62680e - f13) < 1.0E-5d) {
                    break;
                }
                if (fM62680e > f13) {
                    f14 = f;
                } else {
                    f10 = f;
                }
                f12 = f5;
            }
            float f15 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + f) * f3) + f4;
            float f16 = f5;
            while (true) {
                f6 = ((f16 - f11) / 2.0f) + f11;
                f7 = f5 - f6;
                f8 = f6 * 3.0f * f7;
                f9 = f6 * f6 * f6;
                float fM62680e2 = ms2.m62680e(f7, f15, f6, f8) + f9;
                float f17 = f16;
                if (Math.abs(fM62680e2 - f13) >= 1.0E-5d) {
                    if (fM62680e2 > f13) {
                        f16 = f6;
                    } else {
                        f11 = f6;
                        f16 = f17;
                    }
                    f15 = 0.5f;
                }
            }
            fArr2[i] = (((f6 * 0.35000002f) + (f7 * 0.175f)) * f8) + f9;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static double m46825a(float f, float f2) {
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) f2));
    }

    /* JADX INFO: renamed from: b */
    public static f84 m46826b(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float fM63436m = n0e1.m63436m(f, 0.0f, 1.0f);
        float f4 = 100;
        int i = (int) (f4 * fM63436m);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = f88615a;
            float f7 = fArr[i];
            float f8 = (fArr[i2] - f7) / (f6 - f5);
            float fM38555d = edb.m38555d(fM63436m, f5, f8, f7);
            f2 = f8;
            f3 = fM38555d;
        }
        return new f84(f3, f2);
    }
}
