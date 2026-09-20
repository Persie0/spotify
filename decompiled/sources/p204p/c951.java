package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c951 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35405a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d951 f35406b;

    /* JADX INFO: renamed from: c */
    public int f35407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c951(d951 d951Var, fbk fbkVar) {
        super(fbkVar);
        this.f35406b = d951Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35405a = obj;
        this.f35407c |= Integer.MIN_VALUE;
        this.f35406b.collect(null, this);
        return yuk.f276404a;
    }
}
