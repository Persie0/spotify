package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n7s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151206a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p7s0 f151207b;

    /* JADX INFO: renamed from: c */
    public int f151208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7s0(p7s0 p7s0Var, ibk ibkVar) {
        super(ibkVar);
        this.f151207b = p7s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151206a = obj;
        this.f151208c |= Integer.MIN_VALUE;
        return p7s0.m69295f(this.f151207b, null, this);
    }
}
