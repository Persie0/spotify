package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e3s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55878a;

    /* JADX INFO: renamed from: b */
    public int f55879b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f55880c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3s0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f55880c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55878a = obj;
        this.f55879b |= Integer.MIN_VALUE;
        return this.f55880c.emit(null, this);
    }
}
