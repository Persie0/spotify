package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r0q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f194538a;

    /* JADX INFO: renamed from: b */
    public int f194539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f194540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0q(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f194540c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f194538a = obj;
        this.f194539b |= Integer.MIN_VALUE;
        return this.f194540c.emit(null, this);
    }
}
