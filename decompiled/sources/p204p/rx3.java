package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rx3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sx3 f203478b;

    /* JADX INFO: renamed from: c */
    public int f203479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx3(sx3 sx3Var, ibk ibkVar) {
        super(ibkVar);
        this.f203478b = sx3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203477a = obj;
        this.f203479c |= Integer.MIN_VALUE;
        return this.f203478b.m79572a(this);
    }
}
