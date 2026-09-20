package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class boc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f29067a;

    /* JADX INFO: renamed from: b */
    public String f29068b;

    /* JADX INFO: renamed from: c */
    public String f29069c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f29070d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ coc0 f29071e;

    /* JADX INFO: renamed from: f */
    public int f29072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boc0(coc0 coc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f29071e = coc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29070d = obj;
        this.f29072f |= Integer.MIN_VALUE;
        return this.f29071e.mo26574b(null, null, this, false);
    }
}
