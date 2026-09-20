package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class e190 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f55148a;

    /* JADX INFO: renamed from: b */
    public Boolean f55149b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f55150c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ g190 f55151d;

    /* JADX INFO: renamed from: e */
    public int f55152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e190(g190 g190Var, ibk ibkVar) {
        super(ibkVar);
        this.f55151d = g190Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55150c = obj;
        this.f55152e |= Integer.MIN_VALUE;
        return g190.m43348b(this.f55151d, null, null, this);
    }
}
