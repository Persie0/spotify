package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cnp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40052a;

    /* JADX INFO: renamed from: b */
    public int f40053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f40054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnp(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f40054c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40052a = obj;
        this.f40053b |= Integer.MIN_VALUE;
        return this.f40054c.emit(null, this);
    }
}
