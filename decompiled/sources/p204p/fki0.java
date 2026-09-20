package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fki0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70549a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hki0 f70550b;

    /* JADX INFO: renamed from: c */
    public int f70551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fki0(hki0 hki0Var, ibk ibkVar) {
        super(ibkVar);
        this.f70550b = hki0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70549a = obj;
        this.f70551c |= Integer.MIN_VALUE;
        Object objM47847c = this.f70550b.m47847c(0, null, this);
        return objM47847c == yuk.f276404a ? objM47847c : new s6x0(objM47847c);
    }
}
