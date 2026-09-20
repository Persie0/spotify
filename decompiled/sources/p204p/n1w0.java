package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n1w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f149550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q1w0 f149551b;

    /* JADX INFO: renamed from: c */
    public int f149552c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1w0(q1w0 q1w0Var, ibk ibkVar) {
        super(ibkVar);
        this.f149551b = q1w0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f149550a = obj;
        this.f149552c |= Integer.MIN_VALUE;
        return this.f149551b.m71962h(null, null, this);
    }
}
