package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y3e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f268899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z3e f268900b;

    /* JADX INFO: renamed from: c */
    public int f268901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3e(z3e z3eVar, ibk ibkVar) {
        super(ibkVar);
        this.f268900b = z3eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268899a = obj;
        this.f268901c |= Integer.MIN_VALUE;
        return this.f268900b.m95275g(null, this);
    }
}
