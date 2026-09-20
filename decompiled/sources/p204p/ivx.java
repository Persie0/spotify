package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ivx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f106294a;

    /* JADX INFO: renamed from: b */
    public int f106295b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f106296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivx(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f106296c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f106294a = obj;
        this.f106295b |= Integer.MIN_VALUE;
        return this.f106296c.emit(null, this);
    }
}
