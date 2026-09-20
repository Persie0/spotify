package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ud5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f229171a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yd5 f229172b;

    /* JADX INFO: renamed from: c */
    public int f229173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud5(yd5 yd5Var, ibk ibkVar) {
        super(ibkVar);
        this.f229172b = yd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f229171a = obj;
        this.f229173c |= Integer.MIN_VALUE;
        return this.f229172b.m93398d(this);
    }
}
