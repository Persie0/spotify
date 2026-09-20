package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class f7y extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66809a;

    /* JADX INFO: renamed from: b */
    public int f66810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f66811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7y(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f66811c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66809a = obj;
        this.f66810b |= Integer.MIN_VALUE;
        return this.f66811c.emit(null, this);
    }
}
