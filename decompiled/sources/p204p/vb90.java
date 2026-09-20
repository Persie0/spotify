package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vb90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f239441a;

    /* JADX INFO: renamed from: b */
    public int f239442b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f239443c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f239443c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f239441a = obj;
        this.f239442b |= Integer.MIN_VALUE;
        return this.f239443c.emit(null, this);
    }
}
