package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ejw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public ivw f60312a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f60313b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qst0 f60314c;

    /* JADX INFO: renamed from: d */
    public int f60315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejw0(qst0 qst0Var, ibk ibkVar) {
        super(ibkVar);
        this.f60314c = qst0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60313b = obj;
        this.f60315d |= Integer.MIN_VALUE;
        return this.f60314c.m73755n(null, this);
    }
}
