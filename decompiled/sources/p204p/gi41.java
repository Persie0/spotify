package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gi41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f80048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hi41 f80049b;

    /* JADX INFO: renamed from: c */
    public int f80050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi41(hi41 hi41Var, ibk ibkVar) {
        super(ibkVar);
        this.f80049b = hi41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f80048a = obj;
        this.f80050c |= Integer.MIN_VALUE;
        return this.f80049b.m47619a(null, this);
    }
}
