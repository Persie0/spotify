package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dpf extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51318a;

    /* JADX INFO: renamed from: b */
    public int f51319b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f51320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpf(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f51320c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51318a = obj;
        this.f51319b |= Integer.MIN_VALUE;
        return this.f51320c.emit(null, this);
    }
}
