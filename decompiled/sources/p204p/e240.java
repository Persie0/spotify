package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e240 extends ibk {

    /* JADX INFO: renamed from: a */
    public lsi0 f55339a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f55340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h240 f55341c;

    /* JADX INFO: renamed from: d */
    public int f55342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e240(h240 h240Var, ibk ibkVar) {
        super(ibkVar);
        this.f55341c = h240Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55340b = obj;
        this.f55342d |= Integer.MIN_VALUE;
        return this.f55341c.m46476g(this);
    }
}
