package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class l0q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f128495a;

    /* JADX INFO: renamed from: b */
    public int f128496b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f128497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0q(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f128497c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f128495a = obj;
        this.f128496b |= Integer.MIN_VALUE;
        return this.f128497c.emit(null, this);
    }
}
