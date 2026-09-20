package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class px5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f182206a;

    /* JADX INFO: renamed from: b */
    public int f182207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f182208c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f182208c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f182206a = obj;
        this.f182207b |= Integer.MIN_VALUE;
        return this.f182208c.emit(null, this);
    }
}
