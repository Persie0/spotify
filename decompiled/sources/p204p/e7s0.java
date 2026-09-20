package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e7s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57000a;

    /* JADX INFO: renamed from: b */
    public int f57001b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f57002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7s0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f57002c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57000a = obj;
        this.f57001b |= Integer.MIN_VALUE;
        return this.f57002c.emit(null, this);
    }
}
