package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class so2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f211079a;

    /* JADX INFO: renamed from: b */
    public int f211080b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f211081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f211081c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f211079a = obj;
        this.f211080b |= Integer.MIN_VALUE;
        return this.f211081c.emit(null, this);
    }
}
