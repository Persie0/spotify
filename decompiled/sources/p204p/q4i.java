package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q4i extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185181a;

    /* JADX INFO: renamed from: b */
    public int f185182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f185183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4i(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f185183c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185181a = obj;
        this.f185182b |= Integer.MIN_VALUE;
        return this.f185183c.emit(null, this);
    }
}
