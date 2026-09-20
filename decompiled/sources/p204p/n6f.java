package p204p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: classes.dex */
public final class n6f {

    /* JADX INFO: renamed from: b */
    public static final long f150862b;

    /* JADX INFO: renamed from: c */
    public static final long f150863c;

    /* JADX INFO: renamed from: d */
    public static final long f150864d;

    /* JADX INFO: renamed from: e */
    public static final long f150865e;

    /* JADX INFO: renamed from: f */
    public static final long f150866f;

    /* JADX INFO: renamed from: g */
    public static final long f150867g;

    /* JADX INFO: renamed from: h */
    public static final long f150868h;

    /* JADX INFO: renamed from: i */
    public static final long f150869i;

    /* JADX INFO: renamed from: j */
    public static final long f150870j;

    /* JADX INFO: renamed from: k */
    public static final long f150871k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f150872l = 0;

    /* JADX INFO: renamed from: a */
    public final long f150873a;

    static {
        new ly5(3);
        f150862b = rfg1.m75434d(4278190080L);
        f150863c = rfg1.m75434d(4282664004L);
        f150864d = rfg1.m75434d(4287137928L);
        f150865e = rfg1.m75434d(4291611852L);
        f150866f = rfg1.m75434d(4294967295L);
        f150867g = rfg1.m75434d(4294901760L);
        rfg1.m75434d(4278255360L);
        f150868h = rfg1.m75434d(4278190335L);
        rfg1.m75434d(4294967040L);
        rfg1.m75434d(4278255615L);
        f150869i = rfg1.m75434d(4294902015L);
        f150870j = rfg1.m75432b(0);
        f150871k = rfg1.m75431a(0.0f, 0.0f, 0.0f, 0.0f, c9f.f35510u);
    }

    public /* synthetic */ n6f(long j) {
        this.f150873a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final long m63764a(long j, z8f z8fVar) {
        return fgg1.m41603r(m63768e(j), z8fVar).mo82228a(j);
    }

    /* JADX INFO: renamed from: b */
    public static long m63765b(long j, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = m63766c(j);
        }
        if ((i & 2) != 0) {
            f2 = m63770g(j);
        }
        if ((i & 4) != 0) {
            f3 = m63769f(j);
        }
        if ((i & 8) != 0) {
            f4 = m63767d(j);
        }
        return rfg1.m75431a(f2, f3, f4, f, m63768e(j));
    }

    /* JADX INFO: renamed from: c */
    public static final float m63766c(long j) {
        float fM88268h0;
        float f;
        if ((63 & j) == 0) {
            fM88268h0 = (float) wj50.m88268h0((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM88268h0 = (float) wj50.m88268h0((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM88268h0 / f;
    }

    /* JADX INFO: renamed from: d */
    public static final float m63767d(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) wj50.m88268h0((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + ContentType.LONG_FORM_ON_DEMAND;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - phz.f177767a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: e */
    public static final z8f m63768e(long j) {
        float[] fArr = c9f.f35490a;
        return c9f.f35514y[(int) (j & 63)];
    }

    /* JADX INFO: renamed from: f */
    public static final float m63769f(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) wj50.m88268h0((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + ContentType.LONG_FORM_ON_DEMAND;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - phz.f177767a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: g */
    public static final float m63770g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) wj50.m88268h0((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + ContentType.LONG_FORM_ON_DEMAND;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - phz.f177767a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: h */
    public static String m63771h(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m63770g(j));
        sb.append(", ");
        sb.append(m63769f(j));
        sb.append(", ");
        sb.append(m63767d(j));
        sb.append(", ");
        sb.append(m63766c(j));
        sb.append(", ");
        return dq60.m36617q(sb, m63768e(j).f280461a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n6f) {
            return this.f150873a == ((n6f) obj).f150873a;
        }
        return false;
    }

    public final int hashCode() {
        return as91.m27075c(this.f150873a);
    }

    public final String toString() {
        return m63771h(this.f150873a);
    }
}
