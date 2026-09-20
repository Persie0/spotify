package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rux extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202951a;

    /* JADX INFO: renamed from: b */
    public int f202952b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f202953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rux(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f202953c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202951a = obj;
        this.f202952b |= Integer.MIN_VALUE;
        return this.f202953c.emit(null, this);
    }
}
