package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n5r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150604a;

    /* JADX INFO: renamed from: b */
    public int f150605b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f150606c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5r0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f150606c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150604a = obj;
        this.f150605b |= Integer.MIN_VALUE;
        return this.f150606c.emit(null, this);
    }
}
