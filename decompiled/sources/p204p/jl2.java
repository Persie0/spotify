package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jl2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f113464b;

    /* JADX INFO: renamed from: c */
    public int f113465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f113464b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113463a = obj;
        this.f113465c |= Integer.MIN_VALUE;
        return this.f113464b.m70244e(null, this);
    }
}
