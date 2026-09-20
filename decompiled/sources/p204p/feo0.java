package p204p;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class feo0 extends AbstractC2604y8 {
    @Override // p204p.w4u0
    /* JADX INFO: renamed from: c */
    public final double mo41476c(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: h */
    public final int mo41477h(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: j */
    public final long mo41478j(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: k */
    public final long mo41479k(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // p204p.AbstractC2604y8
    /* JADX INFO: renamed from: l */
    public final Random mo41480l() {
        return ThreadLocalRandom.current();
    }
}
