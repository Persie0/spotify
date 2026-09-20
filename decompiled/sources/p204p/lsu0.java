package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lsu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f136613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nsu0 f136614b;

    /* JADX INFO: renamed from: c */
    public int f136615c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsu0(nsu0 nsu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f136614b = nsu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f136613a = obj;
        this.f136615c |= Integer.MIN_VALUE;
        return this.f136614b.m65589b(null, null, this);
    }
}
