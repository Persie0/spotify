package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class z2f extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278561a;

    /* JADX INFO: renamed from: b */
    public int f278562b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f278563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2f(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f278563c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278561a = obj;
        this.f278562b |= Integer.MIN_VALUE;
        return this.f278563c.emit(null, this);
    }
}
