package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ter extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219783a;

    /* JADX INFO: renamed from: b */
    public int f219784b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2189nt f219785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ter(C2189nt c2189nt, fbk fbkVar) {
        super(fbkVar);
        this.f219785c = c2189nt;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219783a = obj;
        this.f219784b |= Integer.MIN_VALUE;
        return this.f219785c.emit(null, this);
    }
}
