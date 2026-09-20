package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nj80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f154467a;

    /* JADX INFO: renamed from: b */
    public int f154468b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f154469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f154469c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f154467a = obj;
        this.f154468b |= Integer.MIN_VALUE;
        return this.f154469c.emit(null, this);
    }
}
