package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gt9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ht9 f84107b;

    /* JADX INFO: renamed from: c */
    public int f84108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt9(ht9 ht9Var, ibk ibkVar) {
        super(ibkVar);
        this.f84107b = ht9Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84106a = obj;
        this.f84108c |= Integer.MIN_VALUE;
        return this.f84107b.m48574a(this);
    }
}
