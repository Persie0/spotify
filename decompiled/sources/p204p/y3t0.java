package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y3t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f268984a;

    /* JADX INFO: renamed from: b */
    public int f268985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f268986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3t0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f268986c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268984a = obj;
        this.f268985b |= Integer.MIN_VALUE;
        return this.f268986c.emit(null, this);
    }
}
