package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s7d1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u7d1 f206340b;

    /* JADX INFO: renamed from: c */
    public int f206341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7d1(u7d1 u7d1Var, ibk ibkVar) {
        super(ibkVar);
        this.f206340b = u7d1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206339a = obj;
        this.f206341c |= Integer.MIN_VALUE;
        return u7d1.m82507h1(this.f206340b, this);
    }
}
