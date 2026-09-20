package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class w5z extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f248211a;

    /* JADX INFO: renamed from: b */
    public int f248212b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ efx f248213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5z(efx efxVar, fbk fbkVar) {
        super(fbkVar);
        this.f248213c = efxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248211a = obj;
        this.f248212b |= Integer.MIN_VALUE;
        return this.f248213c.emit(null, this);
    }
}
