package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jus0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116151a;

    /* JADX INFO: renamed from: b */
    public int f116152b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f116153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jus0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f116153c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116151a = obj;
        this.f116152b |= Integer.MIN_VALUE;
        return this.f116153c.emit(null, this);
    }
}
