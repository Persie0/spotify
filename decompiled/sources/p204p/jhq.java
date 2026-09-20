package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jhq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f112548a;

    /* JADX INFO: renamed from: b */
    public int f112549b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f112550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f112550c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f112548a = obj;
        this.f112549b |= Integer.MIN_VALUE;
        return this.f112550c.emit(null, this);
    }
}
