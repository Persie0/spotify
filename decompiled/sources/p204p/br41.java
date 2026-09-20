package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class br41 extends t400 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ddz0 f29967b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd5 f29968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br41(gd5 gd5Var, ddz0 ddz0Var, ddz0 ddz0Var2) {
        super(ddz0Var);
        this.f29968c = gd5Var;
        this.f29967b = ddz0Var2;
    }

    @Override // p204p.t400, p204p.ddz0
    /* JADX INFO: renamed from: b */
    public final cdz0 mo25847b(long j) {
        cdz0 cdz0VarMo25847b = this.f29967b.mo25847b(j);
        ndz0 ndz0Var = cdz0VarMo25847b.f36973a;
        long j2 = ndz0Var.f152875a;
        long j3 = ndz0Var.f152876b;
        long j4 = this.f29968c.f78729b;
        ndz0 ndz0Var2 = new ndz0(j2, j3 + j4);
        ndz0 ndz0Var3 = cdz0VarMo25847b.f36974b;
        return new cdz0(ndz0Var2, new ndz0(ndz0Var3.f152875a, ndz0Var3.f152876b + j4));
    }
}
