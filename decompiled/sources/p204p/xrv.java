package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xrv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265426a;

    /* JADX INFO: renamed from: b */
    public int f265427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f265428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f265428c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265426a = obj;
        this.f265427b |= Integer.MIN_VALUE;
        return this.f265428c.emit(null, this);
    }
}
