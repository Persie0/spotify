package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pux extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f181539a;

    /* JADX INFO: renamed from: b */
    public int f181540b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f181541c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pux(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f181541c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f181539a = obj;
        this.f181540b |= Integer.MIN_VALUE;
        return this.f181541c.emit(null, this);
    }
}
