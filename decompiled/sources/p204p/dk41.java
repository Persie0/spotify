package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dk41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f49877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lk41 f49878b;

    /* JADX INFO: renamed from: c */
    public int f49879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk41(lk41 lk41Var, ibk ibkVar) {
        super(ibkVar);
        this.f49878b = lk41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49877a = obj;
        this.f49879c |= Integer.MIN_VALUE;
        return this.f49878b.m59215e(this);
    }
}
