package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f43 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65641a;

    /* JADX INFO: renamed from: b */
    public int f65642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f65643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f43(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f65643c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65641a = obj;
        this.f65642b |= Integer.MIN_VALUE;
        return this.f65643c.emit(null, this);
    }
}
