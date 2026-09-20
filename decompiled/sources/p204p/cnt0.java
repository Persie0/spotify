package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cnt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40087a;

    /* JADX INFO: renamed from: b */
    public int f40088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dnt0 f40089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnt0(dnt0 dnt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f40089c = dnt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40087a = obj;
        this.f40088b |= Integer.MIN_VALUE;
        return this.f40089c.mo15629a(null, null, this);
    }
}
