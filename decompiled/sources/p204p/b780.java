package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b780 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24181a;

    /* JADX INFO: renamed from: b */
    public int f24182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f24183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b780(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f24183c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24181a = obj;
        this.f24182b |= Integer.MIN_VALUE;
        return this.f24183c.emit(null, this);
    }
}
