package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class st9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f213858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ut9 f213859b;

    /* JADX INFO: renamed from: c */
    public int f213860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st9(ut9 ut9Var, ibk ibkVar) {
        super(ibkVar);
        this.f213859b = ut9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213858a = obj;
        this.f213860c |= Integer.MIN_VALUE;
        return this.f213859b.m83925c(null, this);
    }
}
