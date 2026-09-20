package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class et51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d951 f62627b;

    /* JADX INFO: renamed from: c */
    public int f62628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et51(d951 d951Var, fbk fbkVar) {
        super(fbkVar);
        this.f62627b = d951Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62626a = obj;
        this.f62628c |= Integer.MIN_VALUE;
        this.f62627b.collect(null, this);
        return yuk.f276404a;
    }
}
