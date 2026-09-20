package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lmm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134991a;

    /* JADX INFO: renamed from: b */
    public int f134992b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f134993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmm0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f134993c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134991a = obj;
        this.f134992b |= Integer.MIN_VALUE;
        return this.f134993c.emit(null, this);
    }
}
