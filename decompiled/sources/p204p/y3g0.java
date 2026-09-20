package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f268913a;

    /* JADX INFO: renamed from: b */
    public u490 f268914b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f268915c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z3g0 f268916d;

    /* JADX INFO: renamed from: e */
    public int f268917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3g0(z3g0 z3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f268916d = z3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268915c = obj;
        this.f268917e |= Integer.MIN_VALUE;
        return this.f268916d.m95281f(null, this);
    }
}
