package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kl2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pl2 f123778b;

    /* JADX INFO: renamed from: c */
    public int f123779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl2(pl2 pl2Var, ibk ibkVar) {
        super(ibkVar);
        this.f123778b = pl2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123777a = obj;
        this.f123779c |= Integer.MIN_VALUE;
        return this.f123778b.m70245f(null, null, null, false, this);
    }
}
