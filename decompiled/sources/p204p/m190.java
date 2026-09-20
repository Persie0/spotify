package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m190 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f138875a;

    /* JADX INFO: renamed from: b */
    public int f138876b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f138877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m190(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f138877c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f138875a = obj;
        this.f138876b |= Integer.MIN_VALUE;
        return this.f138877c.emit(null, this);
    }
}
