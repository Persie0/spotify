package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class atx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19755a;

    /* JADX INFO: renamed from: b */
    public int f19756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f19757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atx(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f19757c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19755a = obj;
        this.f19756b |= Integer.MIN_VALUE;
        return this.f19757c.emit(null, this);
    }
}
