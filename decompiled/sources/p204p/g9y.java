package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g9y extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77916a;

    /* JADX INFO: renamed from: b */
    public int f77917b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f77918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9y(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f77918c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77916a = obj;
        this.f77917b |= Integer.MIN_VALUE;
        return this.f77918c.emit(null, this);
    }
}
