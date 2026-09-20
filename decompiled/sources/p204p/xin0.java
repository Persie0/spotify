package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xin0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f261917a;

    /* JADX INFO: renamed from: b */
    public int f261918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f261919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xin0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f261919c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261917a = obj;
        this.f261918b |= Integer.MIN_VALUE;
        return this.f261919c.emit(null, this);
    }
}
