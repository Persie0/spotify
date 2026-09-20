package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lp80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f135697a;

    /* JADX INFO: renamed from: b */
    public int f135698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f135699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f135699c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f135697a = obj;
        this.f135698b |= Integer.MIN_VALUE;
        return this.f135699c.emit(null, this);
    }
}
