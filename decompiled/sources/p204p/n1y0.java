package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n1y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public z650 f149560a;

    /* JADX INFO: renamed from: b */
    public long f149561b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f149562c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o1y0 f149563d;

    /* JADX INFO: renamed from: e */
    public int f149564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1y0(o1y0 o1y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f149563d = o1y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f149562c = obj;
        this.f149564e |= Integer.MIN_VALUE;
        return this.f149563d.mo40981a(null, this);
    }
}
