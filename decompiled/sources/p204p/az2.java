package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class az2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21398a;

    /* JADX INFO: renamed from: b */
    public int f21399b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f21400c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f21400c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f21398a = obj;
        this.f21399b |= Integer.MIN_VALUE;
        return this.f21400c.emit(null, this);
    }
}
