package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eja0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60170a;

    /* JADX INFO: renamed from: b */
    public int f60171b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fja0 f60172c;

    /* JADX INFO: renamed from: d */
    public bqz0 f60173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eja0(fja0 fja0Var, ibk ibkVar) {
        super(ibkVar);
        this.f60172c = fja0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60170a = obj;
        this.f60171b |= Integer.MIN_VALUE;
        return this.f60172c.mo15629a(null, null, this);
    }
}
