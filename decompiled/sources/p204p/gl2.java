package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gl2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80978a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f80979b;

    /* JADX INFO: renamed from: c */
    public int f80980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f80979b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80978a = obj;
        this.f80980c |= Integer.MIN_VALUE;
        return this.f80979b.m70241b(null, this);
    }
}
