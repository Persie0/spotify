package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ifp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f101800a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ht9 f101801b;

    /* JADX INFO: renamed from: c */
    public int f101802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp0(ht9 ht9Var, ibk ibkVar) {
        super(ibkVar);
        this.f101801b = ht9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f101800a = obj;
        this.f101802c |= Integer.MIN_VALUE;
        return this.f101801b.m48574a(this);
    }
}
