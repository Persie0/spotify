package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p1b0 extends ibk {

    /* JADX INFO: renamed from: a */
    public voc1 f173023a;

    /* JADX INFO: renamed from: b */
    public d850 f173024b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f173025c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ q1b0 f173026d;

    /* JADX INFO: renamed from: e */
    public int f173027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1b0(q1b0 q1b0Var, ibk ibkVar) {
        super(ibkVar);
        this.f173026d = q1b0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173025c = obj;
        this.f173027e |= Integer.MIN_VALUE;
        return this.f173026d.m71919a(null, null, this);
    }
}
