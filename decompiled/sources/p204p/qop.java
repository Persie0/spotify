package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qop extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191024a;

    /* JADX INFO: renamed from: b */
    public int f191025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f191026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qop(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f191026c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191024a = obj;
        this.f191025b |= Integer.MIN_VALUE;
        return this.f191026c.emit(null, this);
    }
}
