package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a1s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11468a;

    /* JADX INFO: renamed from: b */
    public int f11469b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f11470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1s0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f11470c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11468a = obj;
        this.f11469b |= Integer.MIN_VALUE;
        return this.f11470c.emit(null, this);
    }
}
