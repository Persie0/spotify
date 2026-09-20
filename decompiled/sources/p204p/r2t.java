package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r2t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195224a;

    /* JADX INFO: renamed from: b */
    public int f195225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f195226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f195226c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195224a = obj;
        this.f195225b |= Integer.MIN_VALUE;
        return this.f195226c.emit(null, this);
    }
}
