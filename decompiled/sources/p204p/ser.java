package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ser extends ibk {

    /* JADX INFO: renamed from: a */
    public String f208375a;

    /* JADX INFO: renamed from: b */
    public ddr f208376b;

    /* JADX INFO: renamed from: c */
    public qe70 f208377c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f208378d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uer f208379e;

    /* JADX INFO: renamed from: f */
    public int f208380f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ser(uer uerVar, ibk ibkVar) {
        super(ibkVar);
        this.f208379e = uerVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208378d = obj;
        this.f208380f |= Integer.MIN_VALUE;
        return this.f208379e.m82914g(null, null, null, null, this);
    }
}
