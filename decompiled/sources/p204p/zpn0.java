package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zpn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285188a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bqn0 f285189b;

    /* JADX INFO: renamed from: c */
    public int f285190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpn0(bqn0 bqn0Var, ibk ibkVar) {
        super(ibkVar);
        this.f285189b = bqn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285188a = obj;
        this.f285190c |= Integer.MIN_VALUE;
        return this.f285189b.mo30271c(this);
    }
}
