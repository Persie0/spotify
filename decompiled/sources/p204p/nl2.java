package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nl2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f154992b;

    /* JADX INFO: renamed from: c */
    public int f154993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f154992b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154991a = obj;
        this.f154993c |= Integer.MIN_VALUE;
        return this.f154992b.m70248i(null, null, null, null, this);
    }
}
