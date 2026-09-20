package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class tt40 {

    /* JADX INFO: renamed from: a */
    public static final long f223517a = m81497a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f223518b = 0;

    /* JADX INFO: renamed from: a */
    public static long m81497a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static String m81498b(long j) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }
}
