package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kt31 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f126132a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f126133b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qt31 f126134c;

    /* JADX INFO: renamed from: d */
    public int f126135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt31(qt31 qt31Var, ibk ibkVar) {
        super(ibkVar);
        this.f126134c = qt31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f126133b = obj;
        this.f126135d |= Integer.MIN_VALUE;
        return this.f126134c.m73791c(null, this);
    }
}
