package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mox extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145769a;

    /* JADX INFO: renamed from: b */
    public int f145770b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f145771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mox(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f145771c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145769a = obj;
        this.f145770b |= Integer.MIN_VALUE;
        return this.f145771c.emit(null, this);
    }
}
