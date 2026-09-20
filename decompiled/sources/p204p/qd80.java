package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qd80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ud80 f187507b;

    /* JADX INFO: renamed from: c */
    public int f187508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd80(ud80 ud80Var, ibk ibkVar) {
        super(ibkVar);
        this.f187507b = ud80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187506a = obj;
        this.f187508c |= Integer.MIN_VALUE;
        return this.f187507b.m82844c(null, this);
    }
}
