package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class frb0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72400a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ grb0 f72401b;

    /* JADX INFO: renamed from: c */
    public int f72402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frb0(grb0 grb0Var, ibk ibkVar) {
        super(ibkVar);
        this.f72401b = grb0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72400a = obj;
        this.f72402c |= Integer.MIN_VALUE;
        return this.f72401b.m45479b(this);
    }
}
