package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y6y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f269915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z6y0 f269916b;

    /* JADX INFO: renamed from: c */
    public int f269917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6y0(z6y0 z6y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f269916b = z6y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f269915a = obj;
        this.f269917c |= Integer.MIN_VALUE;
        Object objM95519f = z6y0.m95519f(this.f269916b, null, null, this);
        return objM95519f == yuk.f276404a ? objM95519f : new s6x0(objM95519f);
    }
}
