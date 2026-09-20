package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h7m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88490a;

    /* JADX INFO: renamed from: b */
    public int f88491b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f88492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f88492c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88490a = obj;
        this.f88491b |= Integer.MIN_VALUE;
        return this.f88492c.emit(null, this);
    }
}
