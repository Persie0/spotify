package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lkz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134485a;

    /* JADX INFO: renamed from: b */
    public int f134486b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vjz f134487c;

    /* JADX INFO: renamed from: d */
    public k2c f134488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkz(vjz vjzVar, fbk fbkVar) {
        super(fbkVar);
        this.f134487c = vjzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134485a = obj;
        this.f134486b |= Integer.MIN_VALUE;
        return this.f134487c.collect(null, this);
    }
}
