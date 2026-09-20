package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mq80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146209a;

    /* JADX INFO: renamed from: b */
    public int f146210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f146211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f146211c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146209a = obj;
        this.f146210b |= Integer.MIN_VALUE;
        return this.f146211c.emit(null, this);
    }
}
