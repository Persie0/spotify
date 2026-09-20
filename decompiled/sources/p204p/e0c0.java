package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e0c0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54938a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g0c0 f54939b;

    /* JADX INFO: renamed from: c */
    public int f54940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0c0(g0c0 g0c0Var, ibk ibkVar) {
        super(ibkVar);
        this.f54939b = g0c0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54938a = obj;
        this.f54940c |= Integer.MIN_VALUE;
        return g0c0.m43284g(this.f54939b, null, false, this);
    }
}
