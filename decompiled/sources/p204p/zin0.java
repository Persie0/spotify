package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zin0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f283202a;

    /* JADX INFO: renamed from: b */
    public int f283203b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cgm0 f283204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zin0(cgm0 cgm0Var, fbk fbkVar) {
        super(fbkVar);
        this.f283204c = cgm0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f283202a = obj;
        this.f283203b |= Integer.MIN_VALUE;
        return this.f283204c.emit(null, this);
    }
}
