package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class imx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f103786a;

    /* JADX INFO: renamed from: b */
    public int f103787b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f103788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imx(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f103788c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f103786a = obj;
        this.f103787b |= Integer.MIN_VALUE;
        return this.f103788c.emit(null, this);
    }
}
