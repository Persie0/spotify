package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class of90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f164678a;

    /* JADX INFO: renamed from: b */
    public int f164679b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f164680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f164680c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f164678a = obj;
        this.f164679b |= Integer.MIN_VALUE;
        return this.f164680c.emit(null, this);
    }
}
