package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dd40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47699a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fd40 f47700b;

    /* JADX INFO: renamed from: c */
    public int f47701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd40(fd40 fd40Var, ibk ibkVar) {
        super(ibkVar);
        this.f47700b = fd40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f47699a = obj;
        this.f47701c |= Integer.MIN_VALUE;
        Object objM41355c = this.f47700b.m41355c(null, null, null, this);
        return objM41355c == yuk.f276404a ? objM41355c : new s6x0(objM41355c);
    }
}
