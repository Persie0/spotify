package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yb3 implements qaq0 {

    /* JADX INFO: renamed from: a */
    public final ob3 f271063a;

    /* JADX INFO: renamed from: b */
    public final long f271064b;

    public yb3(ob3 ob3Var, long j) {
        this.f271063a = ob3Var;
        this.f271064b = j;
    }

    @Override // p204p.qaq0
    /* JADX INFO: renamed from: a */
    public final long mo26626a(c450 c450Var, long j, ko70 ko70Var, long j2) {
        long jMo66602a = this.f271063a.mo66602a(0L, (((long) c450Var.m31426d()) << 32) | (((long) c450Var.m31424b()) & 4294967295L), ko70Var);
        long jMo66602a2 = this.f271063a.mo66602a(0L, j2, ko70Var);
        long j3 = (((long) (-((int) (jMo66602a2 >> 32)))) << 32) | (((long) (-((int) (jMo66602a2 & 4294967295L)))) & 4294967295L);
        long j4 = this.f271064b;
        return y350.m92731d(y350.m92731d(y350.m92731d(c450Var.m31425c(), jMo66602a), j3), (((long) ((int) (j4 & 4294967295L))) & 4294967295L) | (((long) (((int) (j4 >> 32)) * (ko70Var == ko70.f124556a ? 1 : -1))) << 32));
    }
}
