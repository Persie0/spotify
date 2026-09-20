package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i2e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public k2e1 f97827a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f97828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ k2e1 f97829c;

    /* JADX INFO: renamed from: d */
    public int f97830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2e1(k2e1 k2e1Var, ibk ibkVar) {
        super(ibkVar);
        this.f97829c = k2e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97828b = obj;
        this.f97830d |= Integer.MIN_VALUE;
        return k2e1.m55163a(this.f97829c, this);
    }
}
