package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g2g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f75924a;

    /* JADX INFO: renamed from: b */
    public h2g0 f75925b;

    /* JADX INFO: renamed from: c */
    public int f75926c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f75927d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ h2g0 f75928e;

    /* JADX INFO: renamed from: f */
    public int f75929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2g0(h2g0 h2g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f75928e = h2g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75927d = obj;
        this.f75929f |= Integer.MIN_VALUE;
        Object objM46493d = this.f75928e.m46493d(null, null, null, null, null, null, null, this);
        return objM46493d == yuk.f276404a ? objM46493d : new s6x0(objM46493d);
    }
}
