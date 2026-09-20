package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class krs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125719a;

    /* JADX INFO: renamed from: b */
    public int f125720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f125721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krs0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f125721c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125719a = obj;
        this.f125720b |= Integer.MIN_VALUE;
        return this.f125721c.emit(null, this);
    }
}
