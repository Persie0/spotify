package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class cud1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f42097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f7d1 f42098b;

    /* JADX INFO: renamed from: c */
    public int f42099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cud1(f7d1 f7d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f42098b = f7d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f42097a = obj;
        this.f42099c |= Integer.MIN_VALUE;
        return this.f42098b.m40968d(this);
    }
}
