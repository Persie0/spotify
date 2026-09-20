package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r4n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195811a;

    /* JADX INFO: renamed from: b */
    public int f195812b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f195813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4n0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f195813c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195811a = obj;
        this.f195812b |= Integer.MIN_VALUE;
        return this.f195813c.emit(null, this);
    }
}
