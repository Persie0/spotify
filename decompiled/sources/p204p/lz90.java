package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lz90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f138292a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zb70 f138293b;

    /* JADX INFO: renamed from: c */
    public int f138294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz90(zb70 zb70Var, ibk ibkVar) {
        super(ibkVar);
        this.f138293b = zb70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f138292a = obj;
        this.f138294c |= Integer.MIN_VALUE;
        return this.f138293b.m95827k(null, this);
    }
}
