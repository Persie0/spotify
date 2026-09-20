package p204p;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public abstract class m9f {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f141289a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static int m61213a(float[] fArr) {
        int iM62681f;
        int iRound;
        int iM62681f2 = 0;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float fAbs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f) / 60) {
            case 0:
                iM62681f2 = ms2.m62681f(fAbs, f4, 255.0f);
                iM62681f = ms2.m62681f(fAbs2, f4, 255.0f);
                iRound = Math.round(f4 * 255.0f);
                break;
            case 1:
                iM62681f2 = ms2.m62681f(fAbs2, f4, 255.0f);
                iM62681f = ms2.m62681f(fAbs, f4, 255.0f);
                iRound = Math.round(f4 * 255.0f);
                break;
            case 2:
                iM62681f2 = Math.round(f4 * 255.0f);
                iM62681f = ms2.m62681f(fAbs, f4, 255.0f);
                iRound = ms2.m62681f(fAbs2, f4, 255.0f);
                break;
            case 3:
                iM62681f2 = Math.round(f4 * 255.0f);
                iM62681f = ms2.m62681f(fAbs2, f4, 255.0f);
                iRound = ms2.m62681f(fAbs, f4, 255.0f);
                break;
            case 4:
                iM62681f2 = ms2.m62681f(fAbs2, f4, 255.0f);
                iM62681f = Math.round(f4 * 255.0f);
                iRound = ms2.m62681f(fAbs, f4, 255.0f);
                break;
            case 5:
            case 6:
                iM62681f2 = ms2.m62681f(fAbs, f4, 255.0f);
                iM62681f = Math.round(f4 * 255.0f);
                iRound = ms2.m62681f(fAbs2, f4, 255.0f);
                break;
            default:
                iRound = 0;
                iM62681f = 0;
                break;
        }
        return Color.rgb(m61223k(iM62681f2), m61223k(iM62681f), m61223k(iRound));
    }

    /* JADX INFO: renamed from: b */
    public static void m61214b(int i, int i2, int i3, float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            if (fMax == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else {
                f = fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            }
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = f7 < 0.0f ? 0.0f : Math.min(f7, 360.0f);
        fArr[1] = fAbs < 0.0f ? 0.0f : Math.min(fAbs, 1.0f);
        fArr[2] = f6 >= 0.0f ? Math.min(f6, 1.0f) : 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public static int m61215c(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        return Color.rgb(m61223k((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d)), m61223k((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d)), m61223k((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d)));
    }

    /* JADX INFO: renamed from: d */
    public static int m61216d(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    /* JADX INFO: renamed from: e */
    public static double m61217e(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = m61221i(i, i2);
        }
        double dM61218f = m61218f(i) + 0.05d;
        double dM61218f2 = m61218f(i2) + 0.05d;
        return Math.max(dM61218f, dM61218f2) / Math.min(dM61218f, dM61218f2);
    }

    /* JADX INFO: renamed from: f */
    public static double m61218f(int i) {
        ThreadLocal threadLocal = f141289a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d;
    }

    /* JADX INFO: renamed from: g */
    public static int m61219g(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        double d = f;
        if (m61217e(m61224l(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (m61217e(m61224l(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: h */
    public static void m61220h(int i, float[] fArr) {
        m61214b(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* JADX INFO: renamed from: i */
    public static int m61221i(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i3, m61222j(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), m61222j(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), m61222j(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    /* JADX INFO: renamed from: j */
    public static int m61222j(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    /* JADX INFO: renamed from: k */
    public static int m61223k(int i) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, 255);
    }

    /* JADX INFO: renamed from: l */
    public static int m61224l(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
