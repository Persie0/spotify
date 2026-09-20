package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e2j0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pj70 f55476b;

    /* JADX INFO: renamed from: c */
    public int f55477c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2j0(pj70 pj70Var, ibk ibkVar) {
        super(ibkVar);
        this.f55476b = pj70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55475a = obj;
        this.f55477c |= Integer.MIN_VALUE;
        return this.f55476b.m70125c(null, this);
    }
}
