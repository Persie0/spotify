package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zlr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284057a;

    /* JADX INFO: renamed from: b */
    public int f284058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xlr f284059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlr(xlr xlrVar, fbk fbkVar) {
        super(fbkVar);
        this.f284059c = xlrVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284057a = obj;
        this.f284058b |= Integer.MIN_VALUE;
        return this.f284059c.emit(null, this);
    }
}
