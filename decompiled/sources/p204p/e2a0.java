package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e2a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55412a;

    /* JADX INFO: renamed from: b */
    public int f55413b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f55414c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2a0(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f55414c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55412a = obj;
        this.f55413b |= Integer.MIN_VALUE;
        return this.f55414c.emit(null, this);
    }
}
