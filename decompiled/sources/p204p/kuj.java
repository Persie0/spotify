package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kuj implements muj {
    @Override // p204p.muj
    /* JADX INFO: renamed from: a */
    public final long mo49655a(long j, long j2) {
        float fM46447r = h1h1.m46447r(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM46447r)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM46447r)));
        int i = aby0.f14205a;
        return jFloatToRawIntBits;
    }
}
