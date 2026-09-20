package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ypx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f275087a;

    /* JADX INFO: renamed from: b */
    public int f275088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f275089c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypx(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f275089c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275087a = obj;
        this.f275088b |= Integer.MIN_VALUE;
        return this.f275089c.emit(null, this);
    }
}
