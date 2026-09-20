package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class aw3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20364a;

    /* JADX INFO: renamed from: b */
    public int f20365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f20366c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw3(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f20366c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20364a = obj;
        this.f20365b |= Integer.MIN_VALUE;
        return this.f20366c.emit(null, this);
    }
}
