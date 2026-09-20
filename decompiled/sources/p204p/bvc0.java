package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bvc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31328a;

    /* JADX INFO: renamed from: b */
    public int f31329b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cvc0 f31330c;

    /* JADX INFO: renamed from: d */
    public bqz0 f31331d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvc0(cvc0 cvc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f31330c = cvc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31328a = obj;
        this.f31329b |= Integer.MIN_VALUE;
        return this.f31330c.mo15629a(null, null, this);
    }
}
