package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ckz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39115a;

    /* JADX INFO: renamed from: b */
    public int f39116b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjz f39117c;

    /* JADX INFO: renamed from: d */
    public niz f39118d;

    /* JADX INFO: renamed from: e */
    public Throwable f39119e;

    /* JADX INFO: renamed from: f */
    public int f39120f;

    /* JADX INFO: renamed from: g */
    public int f39121g;

    /* JADX INFO: renamed from: h */
    public long f39122h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckz(vjz vjzVar, fbk fbkVar) {
        super(fbkVar);
        this.f39117c = vjzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39115a = obj;
        this.f39116b |= Integer.MIN_VALUE;
        return this.f39117c.collect(null, this);
    }
}
