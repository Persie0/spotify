package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f280498a;

    /* JADX INFO: renamed from: b */
    public int f280499b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f280500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f280500c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f280498a = obj;
        this.f280499b |= Integer.MIN_VALUE;
        return this.f280500c.emit(null, this);
    }
}
