package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e6n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56670a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g6n0 f56671b;

    /* JADX INFO: renamed from: c */
    public int f56672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6n0(g6n0 g6n0Var, ibk ibkVar) {
        super(ibkVar);
        this.f56671b = g6n0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56670a = obj;
        this.f56672c |= Integer.MIN_VALUE;
        return g6n0.m43759c(this.f56671b, this);
    }
}
