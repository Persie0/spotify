package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h7y extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88562a;

    /* JADX INFO: renamed from: b */
    public int f88563b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f88564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7y(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f88564c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88562a = obj;
        this.f88563b |= Integer.MIN_VALUE;
        return this.f88564c.emit(null, this);
    }
}
