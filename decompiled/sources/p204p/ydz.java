package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ydz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271880a;

    /* JADX INFO: renamed from: b */
    public int f271881b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f271882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydz(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f271882c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271880a = obj;
        this.f271881b |= Integer.MIN_VALUE;
        return this.f271882c.emit(null, this);
    }
}
