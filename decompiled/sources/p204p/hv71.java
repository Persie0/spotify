package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hv71 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f95606a;

    /* JADX INFO: renamed from: b */
    public long f95607b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f95608c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ utu0 f95609d;

    /* JADX INFO: renamed from: e */
    public int f95610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv71(utu0 utu0Var, ibk ibkVar) {
        super(ibkVar);
        this.f95609d = utu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95608c = obj;
        this.f95610e |= Integer.MIN_VALUE;
        return this.f95609d.m83938F(0L, null, this);
    }
}
