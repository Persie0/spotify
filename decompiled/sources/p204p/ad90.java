package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ad90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14579a;

    /* JADX INFO: renamed from: b */
    public int f14580b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f14581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f14581c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f14579a = obj;
        this.f14580b |= Integer.MIN_VALUE;
        return this.f14581c.emit(null, this);
    }
}
