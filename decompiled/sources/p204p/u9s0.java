package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class u9s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public x9s0 f228264a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f228265b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x9s0 f228266c;

    /* JADX INFO: renamed from: d */
    public int f228267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9s0(x9s0 x9s0Var, ibk ibkVar) {
        super(ibkVar);
        this.f228266c = x9s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228265b = obj;
        this.f228267d |= Integer.MIN_VALUE;
        return x9s0.m90267f(this.f228266c, this);
    }
}
