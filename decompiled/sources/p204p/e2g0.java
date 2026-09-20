package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e2g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h2g0 f55466b;

    /* JADX INFO: renamed from: c */
    public int f55467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2g0(h2g0 h2g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f55466b = h2g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55465a = obj;
        this.f55467c |= Integer.MIN_VALUE;
        return h2g0.m46488a(this.f55466b, null, null, null, null, null, null, this);
    }
}
