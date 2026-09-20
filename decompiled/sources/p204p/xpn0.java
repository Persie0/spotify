package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xpn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f264688a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bqn0 f264689b;

    /* JADX INFO: renamed from: c */
    public int f264690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpn0(bqn0 bqn0Var, ibk ibkVar) {
        super(ibkVar);
        this.f264689b = bqn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f264688a = obj;
        this.f264690c |= Integer.MIN_VALUE;
        return this.f264689b.mo30270b(this);
    }
}
