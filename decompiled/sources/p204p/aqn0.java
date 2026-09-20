package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aqn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bqn0 f18743b;

    /* JADX INFO: renamed from: c */
    public int f18744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqn0(bqn0 bqn0Var, ibk ibkVar) {
        super(ibkVar);
        this.f18743b = bqn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f18742a = obj;
        this.f18744c |= Integer.MIN_VALUE;
        return this.f18743b.mo30272d(this);
    }
}
