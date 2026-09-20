package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hf9 implements ddz0 {

    /* JADX INFO: renamed from: a */
    public final jf9 f90638a;

    /* JADX INFO: renamed from: b */
    public final long f90639b;

    /* JADX INFO: renamed from: c */
    public final long f90640c;

    /* JADX INFO: renamed from: d */
    public final long f90641d;

    /* JADX INFO: renamed from: e */
    public final long f90642e;

    /* JADX INFO: renamed from: f */
    public final long f90643f;

    public hf9(jf9 jf9Var, long j, long j2, long j3, long j4, long j5) {
        this.f90638a = jf9Var;
        this.f90639b = j;
        this.f90640c = j2;
        this.f90641d = j3;
        this.f90642e = j4;
        this.f90643f = j5;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        ndz0 ndz0Var = new ndz0(j, if9.m50432h(this.f90638a.mo53155a(j), 0L, this.f90640c, this.f90641d, this.f90642e, this.f90643f));
        return new cdz0(ndz0Var, ndz0Var);
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: d */
    public final boolean mo25849d() {
        return true;
    }

    @Override // p204p.ddz0
    /* JADX INFO: renamed from: g */
    public final long mo25852g() {
        return this.f90639b;
    }

    /* JADX INFO: renamed from: l */
    public final long m47336l(long j) {
        return this.f90638a.mo53155a(j);
    }
}
