package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class avx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20292a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cvx0 f20293b;

    /* JADX INFO: renamed from: c */
    public int f20294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avx0(cvx0 cvx0Var, ibk ibkVar) {
        super(ibkVar);
        this.f20293b = cvx0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20292a = obj;
        this.f20294c |= Integer.MIN_VALUE;
        return this.f20293b.m34072e(null, this);
    }
}
