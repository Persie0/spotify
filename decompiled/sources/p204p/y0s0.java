package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y0s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f268051a;

    /* JADX INFO: renamed from: b */
    public int f268052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f268053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0s0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f268053c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268051a = obj;
        this.f268052b |= Integer.MIN_VALUE;
        return this.f268053c.emit(null, this);
    }
}
