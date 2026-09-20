package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e2t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55515a;

    /* JADX INFO: renamed from: b */
    public int f55516b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f55517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f55517c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55515a = obj;
        this.f55516b |= Integer.MIN_VALUE;
        return this.f55517c.emit(null, this);
    }
}
