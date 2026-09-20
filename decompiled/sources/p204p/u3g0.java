package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226377a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z3g0 f226378b;

    /* JADX INFO: renamed from: c */
    public int f226379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3g0(z3g0 z3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f226378b = z3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226377a = obj;
        this.f226379c |= Integer.MIN_VALUE;
        return this.f226378b.m95277b(this);
    }
}
