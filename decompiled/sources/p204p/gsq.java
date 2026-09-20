package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gsq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84004a;

    /* JADX INFO: renamed from: b */
    public int f84005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f84006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f84006c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84004a = obj;
        this.f84005b |= Integer.MIN_VALUE;
        return this.f84006c.emit(null, this);
    }
}
