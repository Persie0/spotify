package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qwx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f193432a;

    /* JADX INFO: renamed from: b */
    public int f193433b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f193434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwx(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f193434c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193432a = obj;
        this.f193433b |= Integer.MIN_VALUE;
        return this.f193434c.emit(null, this);
    }
}
