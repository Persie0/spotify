package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class h4q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87624a;

    /* JADX INFO: renamed from: b */
    public int f87625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f87626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4q(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f87626c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87624a = obj;
        this.f87625b |= Integer.MIN_VALUE;
        return this.f87626c.emit(null, this);
    }
}
