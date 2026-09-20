package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lgm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133245a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ngm0 f133246b;

    /* JADX INFO: renamed from: c */
    public int f133247c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgm0(ngm0 ngm0Var, ibk ibkVar) {
        super(ibkVar);
        this.f133246b = ngm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133245a = obj;
        this.f133247c |= Integer.MIN_VALUE;
        return this.f133246b.m64390b(this);
    }
}
