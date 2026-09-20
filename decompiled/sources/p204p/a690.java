package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a690 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f12720a;

    /* JADX INFO: renamed from: b */
    public int f12721b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f12722c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a690(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f12722c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12720a = obj;
        this.f12721b |= Integer.MIN_VALUE;
        return this.f12722c.emit(null, this);
    }
}
