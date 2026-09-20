package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y690 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f269708a;

    /* JADX INFO: renamed from: b */
    public int f269709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f269710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y690(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f269710c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f269708a = obj;
        this.f269709b |= Integer.MIN_VALUE;
        return this.f269710c.emit(null, this);
    }
}
