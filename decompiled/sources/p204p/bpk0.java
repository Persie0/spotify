package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bpk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public utc0 f29535a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f29536b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dpk0 f29537c;

    /* JADX INFO: renamed from: d */
    public int f29538d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpk0(dpk0 dpk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f29537c = dpk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29536b = obj;
        this.f29538d |= Integer.MIN_VALUE;
        return this.f29537c.invoke(null, this);
    }
}
