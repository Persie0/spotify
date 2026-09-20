package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sse1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f213587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jgc1 f213588b;

    /* JADX INFO: renamed from: c */
    public int f213589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sse1(jgc1 jgc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f213588b = jgc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213587a = obj;
        this.f213589c |= Integer.MIN_VALUE;
        return this.f213588b.m53294b(null, this);
    }
}
