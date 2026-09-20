package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sz2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f215367a;

    /* JADX INFO: renamed from: b */
    public int f215368b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f215369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz2(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f215369c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f215367a = obj;
        this.f215368b |= Integer.MIN_VALUE;
        return this.f215369c.emit(null, this);
    }
}
