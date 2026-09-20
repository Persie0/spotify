package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mf80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142984a;

    /* JADX INFO: renamed from: b */
    public int f142985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f142986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f142986c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142984a = obj;
        this.f142985b |= Integer.MIN_VALUE;
        return this.f142986c.emit(null, this);
    }
}
