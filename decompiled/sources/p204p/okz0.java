package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class okz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f166698a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rkz0 f166699b;

    /* JADX INFO: renamed from: c */
    public int f166700c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okz0(rkz0 rkz0Var, ibk ibkVar) {
        super(ibkVar);
        this.f166699b = rkz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166698a = obj;
        this.f166700c |= Integer.MIN_VALUE;
        return this.f166699b.m75806a(this);
    }
}
