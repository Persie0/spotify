package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class os21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168717a;

    /* JADX INFO: renamed from: b */
    public int f168718b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ps21 f168719c;

    /* JADX INFO: renamed from: d */
    public bqz0 f168720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os21(ps21 ps21Var, ibk ibkVar) {
        super(ibkVar);
        this.f168719c = ps21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168717a = obj;
        this.f168718b |= Integer.MIN_VALUE;
        return this.f168719c.mo15629a(null, null, this);
    }
}
