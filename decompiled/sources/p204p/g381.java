package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class g381 implements qaq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76146a;

    public g381(int i) {
        this.f76146a = i;
    }

    @Override // p204p.qaq0
    /* JADX INFO: renamed from: a */
    public final long mo26626a(c450 c450Var, long j, ko70 ko70Var, long j2) {
        int iM38556e = edb.m38556e(c450Var.m31426d(), (int) (j2 >> 32), 2, c450Var.f33848a);
        int i = c450Var.f33849b - ((int) (j2 & 4294967295L));
        int i2 = this.f76146a;
        int i3 = i - i2;
        if (i3 < 0) {
            i3 = c450Var.f33851d + i2;
        }
        return (((long) iM38556e) << 32) | (((long) i3) & 4294967295L);
    }
}
