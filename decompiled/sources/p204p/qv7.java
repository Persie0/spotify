package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qv7 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192923a;

    /* JADX INFO: renamed from: b */
    public int f192924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f192925c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv7(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f192925c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192923a = obj;
        this.f192924b |= Integer.MIN_VALUE;
        return this.f192925c.emit(null, this);
    }
}
