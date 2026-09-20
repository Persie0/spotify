package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class a5i extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f12521a;

    /* JADX INFO: renamed from: b */
    public int f12522b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f12523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5i(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f12523c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12521a = obj;
        this.f12522b |= Integer.MIN_VALUE;
        return this.f12523c.emit(null, this);
    }
}
