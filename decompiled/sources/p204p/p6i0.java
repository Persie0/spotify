package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p6i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f174403a;

    /* JADX INFO: renamed from: b */
    public int f174404b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q6i0 f174405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6i0(q6i0 q6i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f174405c = q6i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174403a = obj;
        this.f174404b |= Integer.MIN_VALUE;
        return this.f174405c.mo15629a(null, null, this);
    }
}
