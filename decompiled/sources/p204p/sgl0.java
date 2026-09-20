package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sgl0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vgl0 f208890b;

    /* JADX INFO: renamed from: c */
    public int f208891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgl0(vgl0 vgl0Var, ibk ibkVar) {
        super(ibkVar);
        this.f208890b = vgl0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208889a = obj;
        this.f208891c |= Integer.MIN_VALUE;
        return vgl0.m85488k(this.f208890b, this);
    }
}
