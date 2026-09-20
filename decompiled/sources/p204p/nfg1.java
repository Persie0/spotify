package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nfg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f153378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ egg1 f153379b;

    /* JADX INFO: renamed from: c */
    public int f153380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfg1(egg1 egg1Var, ibk ibkVar) {
        super(ibkVar);
        this.f153379b = egg1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f153378a = obj;
        this.f153380c |= Integer.MIN_VALUE;
        Object objM38871c = this.f153379b.m38871c(null, 0L, this);
        return objM38871c == yuk.f276404a ? objM38871c : new s6x0(objM38871c);
    }
}
