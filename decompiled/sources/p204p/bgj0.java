package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bgj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f26954a;

    /* JADX INFO: renamed from: b */
    public long f26955b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f26956c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dgj0 f26957d;

    /* JADX INFO: renamed from: e */
    public int f26958e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgj0(dgj0 dgj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f26957d = dgj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26956c = obj;
        this.f26958e |= Integer.MIN_VALUE;
        return this.f26957d.mo25862S0(0L, 0L, this);
    }
}
