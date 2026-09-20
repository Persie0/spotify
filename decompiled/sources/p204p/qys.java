package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qys extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f194022a;

    /* JADX INFO: renamed from: b */
    public int f194023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f194024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qys(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f194024c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f194022a = obj;
        this.f194023b |= Integer.MIN_VALUE;
        return this.f194024c.emit(null, this);
    }
}
