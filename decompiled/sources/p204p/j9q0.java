package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class j9q0 extends ibk {

    /* JADX INFO: renamed from: a */
    public fy81 f110226a;

    /* JADX INFO: renamed from: b */
    public n0j f110227b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f110228c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ n9q0 f110229d;

    /* JADX INFO: renamed from: e */
    public int f110230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9q0(n9q0 n9q0Var, ibk ibkVar) {
        super(ibkVar);
        this.f110229d = n9q0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110228c = obj;
        this.f110230e |= Integer.MIN_VALUE;
        return this.f110229d.m63929e(null, this);
    }
}
