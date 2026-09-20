package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mmz0 {

    /* JADX INFO: renamed from: a */
    public static final t05 f145287a = new t05(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final tm91 f145288b = new tm91(new q5s0(16), new q5s0(17));

    /* JADX INFO: renamed from: c */
    public static final long f145289c;

    /* JADX INFO: renamed from: d */
    public static final pg41 f145290d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f145289c = jFloatToRawIntBits;
        f145290d = new pg41(new Offset(jFloatToRawIntBits), 3);
    }
}
