package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e0d1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g0d1 f54946b;

    /* JADX INFO: renamed from: c */
    public int f54947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0d1(g0d1 g0d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f54946b = g0d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54945a = obj;
        this.f54947c |= Integer.MIN_VALUE;
        return this.f54946b.m43294a(null, this);
    }
}
