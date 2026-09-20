package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ll2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f134513b;

    /* JADX INFO: renamed from: c */
    public int f134514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f134513b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134512a = obj;
        this.f134514c |= Integer.MIN_VALUE;
        return this.f134513b.m70246g(null, null, null, this);
    }
}
