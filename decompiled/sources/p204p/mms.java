package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mms extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145244a;

    /* JADX INFO: renamed from: b */
    public int f145245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f145246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mms(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f145246c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145244a = obj;
        this.f145245b |= Integer.MIN_VALUE;
        return this.f145246c.emit(null, this);
    }
}
