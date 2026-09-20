package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rvc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203059a;

    /* JADX INFO: renamed from: b */
    public int f203060b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ svc0 f203061c;

    /* JADX INFO: renamed from: d */
    public bqz0 f203062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvc0(svc0 svc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f203061c = svc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203059a = obj;
        this.f203060b |= Integer.MIN_VALUE;
        return this.f203061c.mo15629a(null, null, this);
    }
}
