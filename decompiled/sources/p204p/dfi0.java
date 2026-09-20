package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dfi0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48606a;

    /* JADX INFO: renamed from: b */
    public int f48607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f48608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfi0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f48608c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f48606a = obj;
        this.f48607b |= Integer.MIN_VALUE;
        return this.f48608c.emit(null, this);
    }
}
