package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lca extends ibk {

    /* JADX INFO: renamed from: a */
    public long f131882a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f131883b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nca f131884c;

    /* JADX INFO: renamed from: d */
    public int f131885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lca(nca ncaVar, ibk ibkVar) {
        super(ibkVar);
        this.f131884c = ncaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131883b = obj;
        this.f131885d |= Integer.MIN_VALUE;
        return this.f131884c.mo25862S0(0L, 0L, this);
    }
}
