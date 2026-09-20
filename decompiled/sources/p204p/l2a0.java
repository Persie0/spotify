package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l2a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Throwable f128955a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f128956b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o2a0 f128957c;

    /* JADX INFO: renamed from: d */
    public int f128958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2a0(o2a0 o2a0Var, ibk ibkVar) {
        super(ibkVar);
        this.f128957c = o2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128956b = obj;
        this.f128958d |= Integer.MIN_VALUE;
        return this.f128957c.m66106a(null, this);
    }
}
