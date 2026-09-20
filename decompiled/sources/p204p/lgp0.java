package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lgp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133258a;

    /* JADX INFO: renamed from: b */
    public int f133259b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f133260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f133260c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133258a = obj;
        this.f133259b |= Integer.MIN_VALUE;
        return this.f133260c.emit(null, this);
    }
}
