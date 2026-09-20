package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lca1 extends ibk {

    /* JADX INFO: renamed from: a */
    public hts0 f131887a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f131888b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mca1 f131889c;

    /* JADX INFO: renamed from: d */
    public int f131890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lca1(mca1 mca1Var, ibk ibkVar) {
        super(ibkVar);
        this.f131889c = mca1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131888b = obj;
        this.f131890d |= Integer.MIN_VALUE;
        return this.f131889c.m61459a(null, this);
    }
}
