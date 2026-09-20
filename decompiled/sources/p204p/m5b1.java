package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class m5b1 {

    /* JADX INFO: renamed from: a */
    public final long f140181a;

    public /* synthetic */ m5b1(long j) {
        this.f140181a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ m5b1 m60851a(long j) {
        return new m5b1(j);
    }

    /* JADX INFO: renamed from: b */
    public static long m60852b(float f, float f2, long j, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m60853c(long j) {
        return j == 0;
    }

    /* JADX INFO: renamed from: d */
    public static final float m60854d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: e */
    public static final float m60855e(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static final long m60856f(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: g */
    public static final long m60857g(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: h */
    public static final long m60858h(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: i */
    public static String m60859i(long j) {
        return "(" + m60854d(j) + ", " + m60855e(j) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m5b1) {
            return this.f140181a == ((m5b1) obj).f140181a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f140181a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long m60860j() {
        return this.f140181a;
    }

    public final String toString() {
        return m60859i(this.f140181a);
    }
}
