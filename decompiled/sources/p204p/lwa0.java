package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lwa0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137495a;

    /* JADX INFO: renamed from: b */
    public int f137496b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nwa0 f137497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwa0(nwa0 nwa0Var, ibk ibkVar) {
        super(ibkVar);
        this.f137497c = nwa0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137495a = obj;
        this.f137496b |= Integer.MIN_VALUE;
        return this.f137497c.mo15629a(null, null, this);
    }
}
