package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h1t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f86696a;

    /* JADX INFO: renamed from: b */
    public int f86697b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f86698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f86698c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86696a = obj;
        this.f86697b |= Integer.MIN_VALUE;
        return this.f86698c.emit(null, this);
    }
}
