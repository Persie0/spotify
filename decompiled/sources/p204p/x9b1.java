package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x9b1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y9b1 f259313b;

    /* JADX INFO: renamed from: c */
    public int f259314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9b1(y9b1 y9b1Var, ibk ibkVar) {
        super(ibkVar);
        this.f259313b = y9b1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259312a = obj;
        this.f259314c |= Integer.MIN_VALUE;
        return y9b1.m93151a(this.f259313b, this);
    }
}
