package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i1o0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f97556a;

    /* JADX INFO: renamed from: b */
    public int f97557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j1o0 f97558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1o0(j1o0 j1o0Var, ibk ibkVar) {
        super(ibkVar);
        this.f97558c = j1o0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97556a = obj;
        this.f97557b |= Integer.MIN_VALUE;
        return this.f97558c.mo15629a(null, null, this);
    }
}
