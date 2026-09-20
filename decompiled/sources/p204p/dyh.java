package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dyh extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54350a;

    /* JADX INFO: renamed from: b */
    public int f54351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f54352c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyh(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f54352c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54350a = obj;
        this.f54351b |= Integer.MIN_VALUE;
        return this.f54352c.emit(null, this);
    }
}
