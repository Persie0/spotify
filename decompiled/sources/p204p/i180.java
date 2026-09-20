package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i180 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f97438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k180 f97439b;

    /* JADX INFO: renamed from: c */
    public int f97440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i180(k180 k180Var, ibk ibkVar) {
        super(ibkVar);
        this.f97439b = k180Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97438a = obj;
        this.f97440c |= Integer.MIN_VALUE;
        return k180.m55050g(this.f97439b, null, this);
    }
}
