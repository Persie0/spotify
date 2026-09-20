package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mmm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145183a;

    /* JADX INFO: renamed from: b */
    public int f145184b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f145185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f145185c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145183a = obj;
        this.f145184b |= Integer.MIN_VALUE;
        return this.f145185c.emit(null, this);
    }
}
