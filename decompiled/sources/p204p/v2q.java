package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v2q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f236709a;

    /* JADX INFO: renamed from: b */
    public int f236710b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f236711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2q(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f236711c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236709a = obj;
        this.f236710b |= Integer.MIN_VALUE;
        return this.f236711c.emit(null, this);
    }
}
