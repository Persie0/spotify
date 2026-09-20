package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wt6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f254861a;

    /* JADX INFO: renamed from: b */
    public int f254862b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f254863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt6(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f254863c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f254861a = obj;
        this.f254862b |= Integer.MIN_VALUE;
        return this.f254863c.emit(null, this);
    }
}
