package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ypn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bqn0 f274993b;

    /* JADX INFO: renamed from: c */
    public int f274994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypn0(bqn0 bqn0Var, ibk ibkVar) {
        super(ibkVar);
        this.f274993b = bqn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274992a = obj;
        this.f274994c |= Integer.MIN_VALUE;
        return this.f274993b.mo30269a(this);
    }
}
