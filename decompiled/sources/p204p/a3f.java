package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a3f extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11946a;

    /* JADX INFO: renamed from: b */
    public int f11947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f11948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3f(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f11948c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11946a = obj;
        this.f11947b |= Integer.MIN_VALUE;
        return this.f11948c.emit(null, this);
    }
}
