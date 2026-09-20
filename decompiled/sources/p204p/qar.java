package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qar extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f186917a;

    /* JADX INFO: renamed from: b */
    public int f186918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f186919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qar(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f186919c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186917a = obj;
        this.f186918b |= Integer.MIN_VALUE;
        return this.f186919c.emit(null, this);
    }
}
