package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class aq80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18133a;

    /* JADX INFO: renamed from: b */
    public int f18134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f18135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f18135c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f18133a = obj;
        this.f18134b |= Integer.MIN_VALUE;
        return this.f18135c.emit(null, this);
    }
}
