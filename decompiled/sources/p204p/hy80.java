package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hy80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96496a;

    /* JADX INFO: renamed from: b */
    public int f96497b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f96498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f96498c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96496a = obj;
        this.f96497b |= Integer.MIN_VALUE;
        return this.f96498c.emit(null, this);
    }
}
