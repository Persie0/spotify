package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class xfj0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f261029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yfj0 f261030b;

    /* JADX INFO: renamed from: c */
    public int f261031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfj0(yfj0 yfj0Var, ibk ibkVar) {
        super(ibkVar);
        this.f261030b = yfj0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261029a = obj;
        this.f261031c |= Integer.MIN_VALUE;
        return this.f261030b.m93565c(0L, this);
    }
}
