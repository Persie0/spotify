package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cl90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39217a;

    /* JADX INFO: renamed from: b */
    public int f39218b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f39219c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f39219c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39217a = obj;
        this.f39218b |= Integer.MIN_VALUE;
        return this.f39219c.emit(null, this);
    }
}
