package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d990 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f46768a;

    /* JADX INFO: renamed from: b */
    public int f46769b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f46770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d990(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f46770c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f46768a = obj;
        this.f46769b |= Integer.MIN_VALUE;
        return this.f46770c.emit(null, this);
    }
}
