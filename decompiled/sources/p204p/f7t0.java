package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f7t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66792a;

    /* JADX INFO: renamed from: b */
    public int f66793b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f66794c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7t0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f66794c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66792a = obj;
        this.f66793b |= Integer.MIN_VALUE;
        return this.f66794c.emit(null, this);
    }
}
