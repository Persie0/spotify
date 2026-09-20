package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gx5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85184a;

    /* JADX INFO: renamed from: b */
    public int f85185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f85186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f85186c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85184a = obj;
        this.f85185b |= Integer.MIN_VALUE;
        return this.f85186c.emit(null, this);
    }
}
