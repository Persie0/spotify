package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u0p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f225572a;

    /* JADX INFO: renamed from: b */
    public int f225573b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f225574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0p0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f225574c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f225572a = obj;
        this.f225573b |= Integer.MIN_VALUE;
        return this.f225574c.emit(null, this);
    }
}
