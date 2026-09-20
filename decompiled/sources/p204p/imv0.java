package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class imv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103781a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jmv0 f103782b;

    /* JADX INFO: renamed from: c */
    public int f103783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imv0(jmv0 jmv0Var, ibk ibkVar) {
        super(ibkVar);
        this.f103782b = jmv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103781a = obj;
        this.f103783c |= Integer.MIN_VALUE;
        return this.f103782b.mo25862S0(0L, 0L, this);
    }
}
