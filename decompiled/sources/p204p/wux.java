package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wux extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f255289a;

    /* JADX INFO: renamed from: b */
    public int f255290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f255291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wux(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f255291c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f255289a = obj;
        this.f255290b |= Integer.MIN_VALUE;
        return this.f255291c.emit(null, this);
    }
}
