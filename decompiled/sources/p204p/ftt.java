package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ftt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f73300a;

    /* JADX INFO: renamed from: b */
    public int f73301b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f73302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftt(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f73302c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f73300a = obj;
        this.f73301b |= Integer.MIN_VALUE;
        return this.f73302c.emit(null, this);
    }
}
