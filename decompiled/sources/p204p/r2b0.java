package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r2b0 implements Iterable, pq60 {

    /* JADX INFO: renamed from: a */
    public final long f195112a;

    /* JADX INFO: renamed from: b */
    public final long f195113b;

    /* JADX INFO: renamed from: c */
    public final long f195114c;

    public r2b0(long j, long j2) {
        this.f195112a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.f195113b = j2;
        this.f195114c = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s2b0(this.f195112a, this.f195113b, this.f195114c);
    }
}
