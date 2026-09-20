package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a0a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11037a;

    /* JADX INFO: renamed from: b */
    public int f11038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f11039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0a0(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f11039c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11037a = obj;
        this.f11038b |= Integer.MIN_VALUE;
        return this.f11039c.emit(null, this);
    }
}
