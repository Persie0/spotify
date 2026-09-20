package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g7y extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f77366a;

    /* JADX INFO: renamed from: b */
    public int f77367b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f77368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7y(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f77368c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f77366a = obj;
        this.f77367b |= Integer.MIN_VALUE;
        return this.f77368c.emit(null, this);
    }
}
