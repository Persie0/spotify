package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a57 extends ibk {

    /* JADX INFO: renamed from: a */
    public xc30 f12449a;

    /* JADX INFO: renamed from: b */
    public Exception f12450b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f12451c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xc30 f12452d;

    /* JADX INFO: renamed from: e */
    public int f12453e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a57(xc30 xc30Var, ibk ibkVar) {
        super(ibkVar);
        this.f12452d = xc30Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12451c = obj;
        this.f12453e |= Integer.MIN_VALUE;
        return xc30.m90340f(this.f12452d, this);
    }
}
