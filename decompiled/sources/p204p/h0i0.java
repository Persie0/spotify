package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h0i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f86301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i0i0 f86302b;

    /* JADX INFO: renamed from: c */
    public int f86303c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0i0(i0i0 i0i0Var, ibk ibkVar) {
        super(ibkVar);
        this.f86302b = i0i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86301a = obj;
        this.f86303c |= Integer.MIN_VALUE;
        return this.f86302b.mo25711a(this);
    }
}
