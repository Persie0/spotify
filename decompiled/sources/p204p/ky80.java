package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ky80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f127718a;

    /* JADX INFO: renamed from: b */
    public int f127719b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f127720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f127720c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f127718a = obj;
        this.f127719b |= Integer.MIN_VALUE;
        return this.f127720c.emit(null, this);
    }
}
