package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i1y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f97621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o1y0 f97622b;

    /* JADX INFO: renamed from: c */
    public int f97623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1y0(o1y0 o1y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f97622b = o1y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97621a = obj;
        this.f97623c |= Integer.MIN_VALUE;
        return this.f97622b.m66088d(null, 0L, this);
    }
}
