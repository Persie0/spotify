package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eg1 f48700b;

    /* JADX INFO: renamed from: c */
    public int f48701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg1(eg1 eg1Var, ibk ibkVar) {
        super(ibkVar);
        this.f48700b = eg1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f48699a = obj;
        this.f48701c |= Integer.MIN_VALUE;
        return this.f48700b.mo38767b(null, this);
    }
}
