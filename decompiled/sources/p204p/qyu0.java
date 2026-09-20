package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qyu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f194042a;

    /* JADX INFO: renamed from: b */
    public boolean f194043b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f194044c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tyu0 f194045d;

    /* JADX INFO: renamed from: e */
    public int f194046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyu0(tyu0 tyu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f194045d = tyu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f194044c = obj;
        this.f194046e |= Integer.MIN_VALUE;
        Object objM82010e = this.f194045d.m82010e(0L, false, this);
        return objM82010e == yuk.f276404a ? objM82010e : new s6x0(objM82010e);
    }
}
