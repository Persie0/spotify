package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g1d0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f75593a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h1d0 f75594b;

    /* JADX INFO: renamed from: c */
    public int f75595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1d0(h1d0 h1d0Var, ibk ibkVar) {
        super(ibkVar);
        this.f75594b = h1d0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75593a = obj;
        this.f75595c |= Integer.MIN_VALUE;
        Object objM46427k = this.f75594b.m46427k(null, null, null, null, this);
        return objM46427k == yuk.f276404a ? objM46427k : new s6x0(objM46427k);
    }
}
