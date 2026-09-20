package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class g1t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f75713a;

    /* JADX INFO: renamed from: b */
    public int f75714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f75715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f75715c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75713a = obj;
        this.f75714b |= Integer.MIN_VALUE;
        return this.f75715c.emit(null, this);
    }
}
