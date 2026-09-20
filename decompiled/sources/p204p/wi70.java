package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wi70 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f251545a;

    /* JADX INFO: renamed from: b */
    public long f251546b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f251547c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xi70 f251548d;

    /* JADX INFO: renamed from: e */
    public int f251549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi70(xi70 xi70Var, ibk ibkVar) {
        super(ibkVar);
        this.f251548d = xi70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f251547c = obj;
        this.f251549e |= Integer.MIN_VALUE;
        return this.f251548d.m91090d(0L, null, this);
    }
}
