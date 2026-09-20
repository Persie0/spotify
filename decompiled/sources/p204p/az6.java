package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class az6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21438a;

    /* JADX INFO: renamed from: b */
    public int f21439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f21440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az6(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f21440c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f21438a = obj;
        this.f21439b |= Integer.MIN_VALUE;
        return this.f21440c.emit(null, this);
    }
}
