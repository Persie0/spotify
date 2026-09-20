package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class npd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f156947a;

    /* JADX INFO: renamed from: b */
    public int f156948b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f156949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f156949c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f156947a = obj;
        this.f156948b |= Integer.MIN_VALUE;
        return this.f156949c.emit(null, this);
    }
}
