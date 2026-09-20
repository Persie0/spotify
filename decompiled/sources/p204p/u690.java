package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u690 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227246a;

    /* JADX INFO: renamed from: b */
    public int f227247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f227248c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u690(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f227248c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227246a = obj;
        this.f227247b |= Integer.MIN_VALUE;
        return this.f227248c.emit(null, this);
    }
}
