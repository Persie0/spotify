package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wlr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252602a;

    /* JADX INFO: renamed from: b */
    public int f252603b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xlr f252604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlr(xlr xlrVar, fbk fbkVar) {
        super(fbkVar);
        this.f252604c = xlrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252602a = obj;
        this.f252603b |= Integer.MIN_VALUE;
        return this.f252604c.emit(null, this);
    }
}
