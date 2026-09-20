package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class obz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f163772a;

    /* JADX INFO: renamed from: b */
    public int f163773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f163774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obz(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f163774c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f163772a = obj;
        this.f163773b |= Integer.MIN_VALUE;
        return this.f163774c.emit(null, this);
    }
}
