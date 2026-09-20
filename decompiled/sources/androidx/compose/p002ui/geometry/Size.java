package androidx.compose.p002ui.geometry;

import p204p.spg1;

/* JADX INFO: loaded from: classes.dex */
public final class Size {

    /* JADX INFO: renamed from: a */
    public final long f494a;

    public /* synthetic */ Size(long j) {
        this.f494a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final long m260a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m261b(float f, float f2, long j, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return m260a(f, f2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m262c(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: d */
    public static final float m263d(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: e */
    public static final float m264e(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* JADX INFO: renamed from: f */
    public static final float m265f(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m266g(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    /* JADX INFO: renamed from: h */
    public static String m267h(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + spg1.m78891A(Float.intBitsToFloat((int) (j >> 32))) + ", " + spg1.m78891A(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Size) {
            return this.f494a == ((Size) obj).f494a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f494a);
    }

    public final String toString() {
        return m267h(this.f494a);
    }
}
