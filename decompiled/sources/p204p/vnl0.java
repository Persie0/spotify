package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vnl0 extends ibk {

    /* JADX INFO: renamed from: a */
    public jsi0 f243158a;

    /* JADX INFO: renamed from: b */
    public int f243159b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f243160c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xnl0 f243161d;

    /* JADX INFO: renamed from: e */
    public int f243162e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnl0(xnl0 xnl0Var, ibk ibkVar) {
        super(ibkVar);
        this.f243161d = xnl0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243160c = obj;
        this.f243162e |= Integer.MIN_VALUE;
        return this.f243161d.mo52454a(this);
    }
}
