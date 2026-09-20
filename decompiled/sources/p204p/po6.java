package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class po6 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f179609a;

    /* JADX INFO: renamed from: b */
    public int f179610b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f179611c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qo6 f179612d;

    /* JADX INFO: renamed from: e */
    public int f179613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po6(qo6 qo6Var, ibk ibkVar) {
        super(ibkVar);
        this.f179612d = qo6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f179611c = obj;
        this.f179613e |= Integer.MIN_VALUE;
        return this.f179612d.m73367c(null, this);
    }
}
