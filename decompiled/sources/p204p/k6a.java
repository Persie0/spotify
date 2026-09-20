package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class k6a extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f119701a;

    /* JADX INFO: renamed from: b */
    public int f119702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f119703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6a(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f119703c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119701a = obj;
        this.f119702b |= Integer.MIN_VALUE;
        return this.f119703c.emit(null, this);
    }
}
