package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x690 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f258617a;

    /* JADX INFO: renamed from: b */
    public int f258618b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f258619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x690(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f258619c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f258617a = obj;
        this.f258618b |= Integer.MIN_VALUE;
        return this.f258619c.emit(null, this);
    }
}
