package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zr41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285536a;

    /* JADX INFO: renamed from: b */
    public int f285537b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xjz0 f285538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr41(xjz0 xjz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f285538c = xjz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f285536a = obj;
        this.f285537b |= Integer.MIN_VALUE;
        this.f285538c.collect(null, this);
        return yuk.f276404a;
    }
}
