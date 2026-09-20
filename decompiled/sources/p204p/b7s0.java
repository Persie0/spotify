package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b7s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24376a;

    /* JADX INFO: renamed from: b */
    public int f24377b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f24378c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7s0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f24378c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24376a = obj;
        this.f24377b |= Integer.MIN_VALUE;
        return this.f24378c.emit(null, this);
    }
}
