package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class use0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dte0 f233620b;

    /* JADX INFO: renamed from: c */
    public int f233621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public use0(dte0 dte0Var, ibk ibkVar) {
        super(ibkVar);
        this.f233620b = dte0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233619a = obj;
        this.f233621c |= Integer.MIN_VALUE;
        return this.f233620b.m36852d(null, null, this);
    }
}
