package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h1y0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f86775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o1y0 f86776b;

    /* JADX INFO: renamed from: c */
    public int f86777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1y0(o1y0 o1y0Var, ibk ibkVar) {
        super(ibkVar);
        this.f86776b = o1y0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86775a = obj;
        this.f86777c |= Integer.MIN_VALUE;
        return this.f86776b.m66087c(0L, null, this);
    }
}
