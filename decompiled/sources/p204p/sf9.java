package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sf9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208504a;

    /* JADX INFO: renamed from: b */
    public int f208505b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f208506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf9(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f208506c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208504a = obj;
        this.f208505b |= Integer.MIN_VALUE;
        return this.f208506c.emit(null, this);
    }
}
