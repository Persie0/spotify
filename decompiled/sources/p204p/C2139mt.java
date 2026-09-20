package p204p;

/* JADX INFO: renamed from: p.mt */
/* JADX INFO: loaded from: classes4.dex */
public final class C2139mt extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146911a;

    /* JADX INFO: renamed from: b */
    public int f146912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f146913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139mt(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f146913c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146911a = obj;
        this.f146912b |= Integer.MIN_VALUE;
        return this.f146913c.emit(null, this);
    }
}
