package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mbz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141992a;

    /* JADX INFO: renamed from: b */
    public int f141993b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f141994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbz(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f141994c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141992a = obj;
        this.f141993b |= Integer.MIN_VALUE;
        return this.f141994c.emit(null, this);
    }
}
