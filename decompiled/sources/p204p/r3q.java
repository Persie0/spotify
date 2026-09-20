package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r3q extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195538a;

    /* JADX INFO: renamed from: b */
    public int f195539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f195540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3q(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f195540c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195538a = obj;
        this.f195539b |= Integer.MIN_VALUE;
        return this.f195540c.emit(null, this);
    }
}
