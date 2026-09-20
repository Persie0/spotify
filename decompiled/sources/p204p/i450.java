package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i450 implements muj {

    /* JADX INFO: renamed from: b */
    public static final i450 f98434b = new i450(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f98435a;

    public /* synthetic */ i450(int i) {
        this.f98435a = i;
    }

    @Override // p204p.muj
    /* JADX INFO: renamed from: a */
    public final long mo49655a(long j, long j2) {
        switch (this.f98435a) {
            case 0:
                float fFloor = (float) Math.floor(Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L))));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor)) << 32) | (((long) Float.floatToRawIntBits(fFloor)) & 4294967295L);
                int i = aby0.f14205a;
                return jFloatToRawIntBits;
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i2 = aby0.f14205a;
                return jFloatToRawIntBits2;
            case 2:
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
                int i3 = aby0.f14205a;
                return jFloatToRawIntBits3;
            case 3:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i4 = aby0.f14205a;
                return jFloatToRawIntBits4;
            case 4:
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i5 = aby0.f14205a;
                return jFloatToRawIntBits5;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i6 = aby0.f14205a;
                    return jFloatToRawIntBits6;
                }
                float fM46447r = h1h1.m46447r(j, j2);
                long jFloatToRawIntBits7 = (((long) Float.floatToRawIntBits(fM46447r)) << 32) | (((long) Float.floatToRawIntBits(fM46447r)) & 4294967295L);
                int i7 = aby0.f14205a;
                return jFloatToRawIntBits7;
        }
    }
}
