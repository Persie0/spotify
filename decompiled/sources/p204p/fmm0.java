package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fmm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f71083a;

    /* JADX INFO: renamed from: b */
    public int f71084b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f71085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f71085c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71083a = obj;
        this.f71084b |= Integer.MIN_VALUE;
        return this.f71085c.emit(null, this);
    }
}
