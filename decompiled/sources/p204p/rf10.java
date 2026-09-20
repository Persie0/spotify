package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rf10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f198481a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xf10 f198482b;

    /* JADX INFO: renamed from: c */
    public int f198483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf10(xf10 xf10Var, ibk ibkVar) {
        super(ibkVar);
        this.f198482b = xf10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198481a = obj;
        this.f198483c |= Integer.MIN_VALUE;
        return this.f198482b.m90446a(null, this);
    }
}
