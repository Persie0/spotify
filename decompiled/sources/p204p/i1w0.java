package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i1w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f97612a;

    /* JADX INFO: renamed from: b */
    public int f97613b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f97614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1w0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f97614c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97612a = obj;
        this.f97613b |= Integer.MIN_VALUE;
        return this.f97614c.emit(null, this);
    }
}
