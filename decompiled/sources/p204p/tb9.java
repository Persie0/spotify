package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tb9 implements ob3 {

    /* JADX INFO: renamed from: a */
    public final float f218798a;

    public tb9(float f) {
        this.f218798a = f;
    }

    @Override // p204p.ob3
    /* JADX INFO: renamed from: a */
    public final long mo66602a(long j, long j2, ko70 ko70Var) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f = 1;
        float f2 = (this.f218798a + f) * (((int) (j3 >> 32)) / 2.0f);
        return (((long) Math.round((f - 1.0f) * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f2)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb9) && Float.compare(this.f218798a, ((tb9) obj).f218798a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f218798a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f218798a + ", verticalBias=-1.0)";
    }
}
