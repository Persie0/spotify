package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ha21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89100a;

    /* JADX INFO: renamed from: b */
    public int f89101b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f89102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f89102c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89100a = obj;
        this.f89101b |= Integer.MIN_VALUE;
        return this.f89102c.emit(null, this);
    }
}
