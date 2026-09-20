package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y1n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f268339a;

    /* JADX INFO: renamed from: b */
    public int f268340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f268341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1n0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f268341c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268339a = obj;
        this.f268340b |= Integer.MIN_VALUE;
        return this.f268341c.emit(null, this);
    }
}
