package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b0a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21810a;

    /* JADX INFO: renamed from: b */
    public int f21811b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f21812c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0a0(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f21812c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f21810a = obj;
        this.f21811b |= Integer.MIN_VALUE;
        return this.f21812c.emit(null, this);
    }
}
