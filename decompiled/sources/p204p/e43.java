package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e43 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55929a;

    /* JADX INFO: renamed from: b */
    public int f55930b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f55931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e43(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f55931c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55929a = obj;
        this.f55930b |= Integer.MIN_VALUE;
        return this.f55931c.emit(null, this);
    }
}
