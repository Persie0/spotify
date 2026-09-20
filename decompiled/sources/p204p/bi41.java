package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bi41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ci41 f27333b;

    /* JADX INFO: renamed from: c */
    public int f27334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi41(ci41 ci41Var, ibk ibkVar) {
        super(ibkVar);
        this.f27333b = ci41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27332a = obj;
        this.f27334c |= Integer.MIN_VALUE;
        return this.f27333b.m32868c(null, null, null, this);
    }
}
