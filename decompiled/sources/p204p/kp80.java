package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kp80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125008a;

    /* JADX INFO: renamed from: b */
    public int f125009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f125010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f125010c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125008a = obj;
        this.f125009b |= Integer.MIN_VALUE;
        return this.f125010c.emit(null, this);
    }
}
