package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nnv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f156495a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f156496b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ onv0 f156497c;

    /* JADX INFO: renamed from: d */
    public int f156498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnv0(onv0 onv0Var, ibk ibkVar) {
        super(ibkVar);
        this.f156497c = onv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f156496b = obj;
        this.f156498d |= Integer.MIN_VALUE;
        return onv0.m67422f(this.f156497c, null, this);
    }
}
