package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class afq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15198a;

    /* JADX INFO: renamed from: b */
    public int f15199b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f15200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f15200c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f15198a = obj;
        this.f15199b |= Integer.MIN_VALUE;
        return this.f15200c.emit(null, this);
    }
}
