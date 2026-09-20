package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jmx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f113956a;

    /* JADX INFO: renamed from: b */
    public int f113957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f113958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmx(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f113958c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f113956a = obj;
        this.f113957b |= Integer.MIN_VALUE;
        return this.f113958c.emit(null, this);
    }
}
