package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g1j extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f75636a;

    /* JADX INFO: renamed from: b */
    public int f75637b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f75638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1j(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f75638c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75636a = obj;
        this.f75637b |= Integer.MIN_VALUE;
        return this.f75638c.emit(null, this);
    }
}
