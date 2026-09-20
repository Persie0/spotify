package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eki0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hki0 f60459b;

    /* JADX INFO: renamed from: c */
    public int f60460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eki0(hki0 hki0Var, ibk ibkVar) {
        super(ibkVar);
        this.f60459b = hki0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60458a = obj;
        this.f60460c |= Integer.MIN_VALUE;
        Object objM47846b = this.f60459b.m47846b(null, this);
        return objM47846b == yuk.f276404a ? objM47846b : new s6x0(objM47846b);
    }
}
