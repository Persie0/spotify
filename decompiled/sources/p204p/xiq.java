package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xiq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f261928a;

    /* JADX INFO: renamed from: b */
    public int f261929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f261930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xiq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f261930c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f261928a = obj;
        this.f261929b |= Integer.MIN_VALUE;
        return this.f261930c.emit(null, this);
    }
}
