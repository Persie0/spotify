package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n451 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t451 f150210b;

    /* JADX INFO: renamed from: c */
    public int f150211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n451(t451 t451Var, ibk ibkVar) {
        super(ibkVar);
        this.f150210b = t451Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150209a = obj;
        this.f150211c |= Integer.MIN_VALUE;
        return this.f150210b.m80035e(this);
    }
}
