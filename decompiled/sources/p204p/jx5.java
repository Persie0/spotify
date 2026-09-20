package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jx5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116803a;

    /* JADX INFO: renamed from: b */
    public int f116804b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f116805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f116805c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116803a = obj;
        this.f116804b |= Integer.MIN_VALUE;
        return this.f116805c.emit(null, this);
    }
}
