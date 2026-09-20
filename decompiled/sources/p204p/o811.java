package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o811 extends ibk {

    /* JADX INFO: renamed from: a */
    public Throwable f162673a;

    /* JADX INFO: renamed from: b */
    public String f162674b;

    /* JADX INFO: renamed from: c */
    public String f162675c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f162676d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ u4l0 f162677e;

    /* JADX INFO: renamed from: f */
    public int f162678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o811(u4l0 u4l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f162677e = u4l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162676d = obj;
        this.f162678f |= Integer.MIN_VALUE;
        return this.f162677e.m82356g(null, null, null, this);
    }
}
