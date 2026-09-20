package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class s350 {

    /* JADX INFO: renamed from: a */
    public final long f205174a;

    /* JADX INFO: renamed from: a */
    public static long m77118a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s350) {
            return this.f205174a == ((s350) obj).f205174a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f205174a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.f205174a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return edb.m38567p(sb, (int) (j & 4294967295L), ')');
    }
}
