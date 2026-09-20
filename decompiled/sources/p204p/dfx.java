package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dfx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48672a;

    /* JADX INFO: renamed from: b */
    public int f48673b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f48674c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfx(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f48674c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f48672a = obj;
        this.f48673b |= Integer.MIN_VALUE;
        return this.f48674c.emit(null, this);
    }
}
