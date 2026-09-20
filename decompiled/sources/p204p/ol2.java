package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ol2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f166730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f166731b;

    /* JADX INFO: renamed from: c */
    public int f166732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f166731b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166730a = obj;
        this.f166732c |= Integer.MIN_VALUE;
        return this.f166731b.m70249j(null, null, null, null, null, this);
    }
}
