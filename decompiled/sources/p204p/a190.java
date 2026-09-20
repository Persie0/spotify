package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a190 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11358a;

    /* JADX INFO: renamed from: b */
    public int f11359b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f11360c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a190(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f11360c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11358a = obj;
        this.f11359b |= Integer.MIN_VALUE;
        return this.f11360c.emit(null, this);
    }
}
