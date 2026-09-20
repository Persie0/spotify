package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yp80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274874a;

    /* JADX INFO: renamed from: b */
    public int f274875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f274876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f274876c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274874a = obj;
        this.f274875b |= Integer.MIN_VALUE;
        return this.f274876c.emit(null, this);
    }
}
