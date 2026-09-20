package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class iiz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102652a;

    /* JADX INFO: renamed from: b */
    public int f102653b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f102654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iiz(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f102654c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102652a = obj;
        this.f102653b |= Integer.MIN_VALUE;
        return this.f102654c.emit(null, this);
    }
}
