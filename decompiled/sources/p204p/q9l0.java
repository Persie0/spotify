package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r9l0 f186620b;

    /* JADX INFO: renamed from: c */
    public int f186621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9l0(r9l0 r9l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f186620b = r9l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186619a = obj;
        this.f186621c |= Integer.MIN_VALUE;
        return r9l0.m75080e(this.f186620b, this);
    }
}
