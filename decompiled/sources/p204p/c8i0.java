package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c8i0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35244a;

    /* JADX INFO: renamed from: b */
    public int f35245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f35246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8i0(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f35246c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35244a = obj;
        this.f35245b |= Integer.MIN_VALUE;
        return this.f35246c.emit(null, this);
    }
}
