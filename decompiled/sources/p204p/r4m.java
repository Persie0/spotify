package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r4m extends ibk {

    /* JADX INFO: renamed from: a */
    public String f195806a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f195807b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r87 f195808c;

    /* JADX INFO: renamed from: d */
    public int f195809d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4m(r87 r87Var, ibk ibkVar) {
        super(ibkVar);
        this.f195808c = r87Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195807b = obj;
        this.f195809d |= Integer.MIN_VALUE;
        return this.f195808c.mo36073a(null, null, null, this);
    }
}
