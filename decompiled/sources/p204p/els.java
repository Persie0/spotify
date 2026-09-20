package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class els extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60748a;

    /* JADX INFO: renamed from: b */
    public int f60749b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f60750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public els(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f60750c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60748a = obj;
        this.f60749b |= Integer.MIN_VALUE;
        return this.f60750c.emit(null, this);
    }
}
