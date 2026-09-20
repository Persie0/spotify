package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class pn00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f179274a;

    /* JADX INFO: renamed from: b */
    public int f179275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qn00 f179276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn00(qn00 qn00Var, ibk ibkVar) {
        super(ibkVar);
        this.f179276c = qn00Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f179274a = obj;
        this.f179275b |= Integer.MIN_VALUE;
        return this.f179276c.mo15629a(null, null, this);
    }
}
