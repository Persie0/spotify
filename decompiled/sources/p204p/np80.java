package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class np80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f156895a;

    /* JADX INFO: renamed from: b */
    public int f156896b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f156897c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f156897c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f156895a = obj;
        this.f156896b |= Integer.MIN_VALUE;
        return this.f156897c.emit(null, this);
    }
}
