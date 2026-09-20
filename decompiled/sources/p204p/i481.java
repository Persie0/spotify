package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class i481 implements qaq0 {

    /* JADX INFO: renamed from: a */
    public final int f98463a;

    public i481(int i) {
        this.f98463a = i;
    }

    @Override // p204p.qaq0
    /* JADX INFO: renamed from: a */
    public final long mo26626a(c450 c450Var, long j, ko70 ko70Var, long j2) {
        int i = (int) (j2 >> 32);
        int iM38556e = edb.m38556e(c450Var.m31426d(), i, 2, c450Var.f33848a);
        if (iM38556e < 0) {
            iM38556e = c450Var.f33848a;
        } else if (iM38556e + i > ((int) (j >> 32))) {
            iM38556e = c450Var.f33850c - i;
        }
        int i2 = c450Var.f33849b - ((int) (j2 & 4294967295L));
        int i3 = this.f98463a;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = c450Var.f33851d + i3;
        }
        return (((long) i4) & 4294967295L) | (((long) iM38556e) << 32);
    }
}
