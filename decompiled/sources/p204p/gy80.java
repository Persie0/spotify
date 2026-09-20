package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gy80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85514a;

    /* JADX INFO: renamed from: b */
    public int f85515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f85516c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f85516c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85514a = obj;
        this.f85515b |= Integer.MIN_VALUE;
        return this.f85516c.emit(null, this);
    }
}
