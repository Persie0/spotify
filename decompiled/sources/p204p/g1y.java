package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g1y extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f75767a;

    /* JADX INFO: renamed from: b */
    public int f75768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f75769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1y(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f75769c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75767a = obj;
        this.f75768b |= Integer.MIN_VALUE;
        return this.f75769c.emit(null, this);
    }
}
