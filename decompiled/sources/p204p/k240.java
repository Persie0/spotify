package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k240 extends ibk {

    /* JADX INFO: renamed from: a */
    public jj1 f118489a;

    /* JADX INFO: renamed from: b */
    public String f118490b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f118491c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jj1 f118492d;

    /* JADX INFO: renamed from: e */
    public int f118493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k240(jj1 jj1Var, ibk ibkVar) {
        super(ibkVar);
        this.f118492d = jj1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118491c = obj;
        this.f118493e |= Integer.MIN_VALUE;
        return this.f118492d.mo28141b(null, null, this);
    }
}
