package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e9y extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57551a;

    /* JADX INFO: renamed from: b */
    public int f57552b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f57553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9y(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f57553c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57551a = obj;
        this.f57552b |= Integer.MIN_VALUE;
        return this.f57553c.emit(null, this);
    }
}
