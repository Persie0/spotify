package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x3e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f257797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z3e f257798b;

    /* JADX INFO: renamed from: c */
    public int f257799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3e(z3e z3eVar, ibk ibkVar) {
        super(ibkVar);
        this.f257798b = z3eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257797a = obj;
        this.f257799c |= Integer.MIN_VALUE;
        return this.f257798b.m95274f(this);
    }
}
