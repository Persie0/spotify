package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zn0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284381a;

    /* JADX INFO: renamed from: b */
    public int f284382b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f284383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f284383c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284381a = obj;
        this.f284382b |= Integer.MIN_VALUE;
        return this.f284383c.emit(null, this);
    }
}
