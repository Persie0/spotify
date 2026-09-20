package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cte0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f41865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dte0 f41866b;

    /* JADX INFO: renamed from: c */
    public int f41867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cte0(dte0 dte0Var, ibk ibkVar) {
        super(ibkVar);
        this.f41866b = dte0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41865a = obj;
        this.f41867c |= Integer.MIN_VALUE;
        return dte0.m36849b(this.f41866b, null, this);
    }
}
