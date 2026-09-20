package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class peb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f176696a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qeb1 f176697b;

    /* JADX INFO: renamed from: c */
    public int f176698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peb1(qeb1 qeb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f176697b = qeb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f176696a = obj;
        this.f176698c |= Integer.MIN_VALUE;
        return this.f176697b.m72606b(this);
    }
}
