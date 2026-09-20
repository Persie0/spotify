package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wnl0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f253213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xnl0 f253214b;

    /* JADX INFO: renamed from: c */
    public int f253215c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnl0(xnl0 xnl0Var, ibk ibkVar) {
        super(ibkVar);
        this.f253214b = xnl0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f253213a = obj;
        this.f253215c |= Integer.MIN_VALUE;
        return xnl0.m91507b(this.f253214b, this);
    }
}
