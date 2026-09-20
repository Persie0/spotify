package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zn9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284439a;

    /* JADX INFO: renamed from: b */
    public int f284440b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f284441c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn9(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f284441c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284439a = obj;
        this.f284440b |= Integer.MIN_VALUE;
        return this.f284441c.emit(null, this);
    }
}
