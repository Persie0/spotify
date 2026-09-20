package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o2y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public f3y0 f161175a;

    /* JADX INFO: renamed from: b */
    public vn80 f161176b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f161177c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ p2y0 f161178d;

    /* JADX INFO: renamed from: e */
    public int f161179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2y0(p2y0 p2y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f161178d = p2y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161177c = obj;
        this.f161179e |= Integer.MIN_VALUE;
        return this.f161178d.m68972a(null, this);
    }
}
