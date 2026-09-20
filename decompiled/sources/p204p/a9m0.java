package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a9m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13600a;

    /* JADX INFO: renamed from: b */
    public int f13601b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f13602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f13602c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13600a = obj;
        this.f13601b |= Integer.MIN_VALUE;
        return this.f13602c.emit(null, this);
    }
}
