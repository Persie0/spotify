package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bl1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cl1 f28054b;

    /* JADX INFO: renamed from: c */
    public int f28055c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl1(cl1 cl1Var, ibk ibkVar) {
        super(ibkVar);
        this.f28054b = cl1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f28053a = obj;
        this.f28055c |= Integer.MIN_VALUE;
        return this.f28054b.mo33214i(null, this);
    }
}
