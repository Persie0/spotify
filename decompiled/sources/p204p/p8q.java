package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p8q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175017a;

    /* JADX INFO: renamed from: b */
    public int f175018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f175019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8q(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f175019c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175017a = obj;
        this.f175018b |= Integer.MIN_VALUE;
        return this.f175019c.emit(null, this);
    }
}
