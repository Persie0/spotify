package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f9z extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f67391a;

    /* JADX INFO: renamed from: b */
    public int f67392b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f67393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9z(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f67393c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f67391a = obj;
        this.f67392b |= Integer.MIN_VALUE;
        return this.f67393c.emit(null, this);
    }
}
