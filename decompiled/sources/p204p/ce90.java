package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ce90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f37063a;

    /* JADX INFO: renamed from: b */
    public int f37064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f37065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f37065c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f37063a = obj;
        this.f37064b |= Integer.MIN_VALUE;
        return this.f37065c.emit(null, this);
    }
}
