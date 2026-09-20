package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cba1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f36067a;

    /* JADX INFO: renamed from: b */
    public int f36068b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dba1 f36069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cba1(dba1 dba1Var, ibk ibkVar) {
        super(ibkVar);
        this.f36069c = dba1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f36067a = obj;
        this.f36068b |= Integer.MIN_VALUE;
        return this.f36069c.mo15629a(null, null, this);
    }
}
