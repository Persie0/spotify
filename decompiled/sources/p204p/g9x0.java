package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g9x0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77913a;

    /* JADX INFO: renamed from: b */
    public int f77914b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ h9x0 f77915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9x0(h9x0 h9x0Var, ibk ibkVar) {
        super(ibkVar);
        this.f77915c = h9x0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77913a = obj;
        this.f77914b |= Integer.MIN_VALUE;
        return this.f77915c.mo15629a(null, null, this);
    }
}
