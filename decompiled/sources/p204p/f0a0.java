package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f0a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64578a;

    /* JADX INFO: renamed from: b */
    public int f64579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f64580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0a0(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f64580c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64578a = obj;
        this.f64579b |= Integer.MIN_VALUE;
        return this.f64580c.emit(null, this);
    }
}
