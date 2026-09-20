package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jb40 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f110641a;

    /* JADX INFO: renamed from: b */
    public Exception f110642b;

    /* JADX INFO: renamed from: c */
    public int f110643c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f110644d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kb40 f110645e;

    /* JADX INFO: renamed from: f */
    public int f110646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb40(kb40 kb40Var, ibk ibkVar) {
        super(ibkVar);
        this.f110645e = kb40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110644d = obj;
        this.f110646f |= Integer.MIN_VALUE;
        return this.f110645e.m55929f(null, this);
    }
}
