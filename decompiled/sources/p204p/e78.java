package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e78 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56859a;

    /* JADX INFO: renamed from: b */
    public int f56860b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f56861c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e78(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f56861c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56859a = obj;
        this.f56860b |= Integer.MIN_VALUE;
        return this.f56861c.emit(null, this);
    }
}
