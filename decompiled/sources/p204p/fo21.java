package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fo21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f71405a;

    /* JADX INFO: renamed from: b */
    public int f71406b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f71407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo21(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f71407c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71405a = obj;
        this.f71406b |= Integer.MIN_VALUE;
        return this.f71407c.emit(null, this);
    }
}
