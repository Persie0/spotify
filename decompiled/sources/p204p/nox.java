package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nox extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f156802a;

    /* JADX INFO: renamed from: b */
    public int f156803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ oox f156804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nox(oox ooxVar, fbk fbkVar) {
        super(fbkVar);
        this.f156804c = ooxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f156802a = obj;
        this.f156803b |= Integer.MIN_VALUE;
        return this.f156804c.emit(null, this);
    }
}
