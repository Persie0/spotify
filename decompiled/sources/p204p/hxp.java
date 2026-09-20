package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hxp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96258a;

    /* JADX INFO: renamed from: b */
    public int f96259b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f96260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxp(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f96260c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96258a = obj;
        this.f96259b |= Integer.MIN_VALUE;
        return this.f96260c.emit(null, this);
    }
}
