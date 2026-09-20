package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i1t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f97587a;

    /* JADX INFO: renamed from: b */
    public int f97588b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f97589c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f97589c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97587a = obj;
        this.f97588b |= Integer.MIN_VALUE;
        return this.f97589c.emit(null, this);
    }
}
