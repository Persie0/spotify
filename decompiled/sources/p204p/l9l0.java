package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class l9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r9l0 f131145b;

    /* JADX INFO: renamed from: c */
    public int f131146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9l0(r9l0 r9l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f131145b = r9l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131144a = obj;
        this.f131146c |= Integer.MIN_VALUE;
        return this.f131145b.m75081f(this);
    }
}
