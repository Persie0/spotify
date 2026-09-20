package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class llz0 {

    /* JADX INFO: renamed from: a */
    public static final float f134725a;

    /* JADX INFO: renamed from: b */
    public static final float f134726b;

    /* JADX INFO: renamed from: c */
    public static final lpz0 f134727c = new lpz0("SelectionHandleInfo");

    static {
        float f = 25;
        f134725a = f;
        f134726b = f;
    }

    /* JADX INFO: renamed from: a */
    public static final long m59317a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
