package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q6z extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185962a;

    /* JADX INFO: renamed from: b */
    public int f185963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f185964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6z(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f185964c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185962a = obj;
        this.f185963b |= Integer.MIN_VALUE;
        return this.f185964c.emit(null, this);
    }
}
