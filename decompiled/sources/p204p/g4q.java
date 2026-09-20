package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class g4q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f76500a;

    /* JADX INFO: renamed from: b */
    public int f76501b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f76502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4q(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f76502c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76500a = obj;
        this.f76501b |= Integer.MIN_VALUE;
        return this.f76502c.emit(null, this);
    }
}
