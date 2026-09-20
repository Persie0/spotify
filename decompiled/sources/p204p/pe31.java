package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pe31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f176623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ue31 f176624b;

    /* JADX INFO: renamed from: c */
    public int f176625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe31(ue31 ue31Var, ibk ibkVar) {
        super(ibkVar);
        this.f176624b = ue31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f176623a = obj;
        this.f176625c |= Integer.MIN_VALUE;
        return this.f176624b.m82883g(null, null, this);
    }
}
