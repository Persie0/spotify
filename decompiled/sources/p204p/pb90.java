package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pb90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f175742a;

    /* JADX INFO: renamed from: b */
    public int f175743b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f175744c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f175744c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175742a = obj;
        this.f175743b |= Integer.MIN_VALUE;
        return this.f175744c.emit(null, this);
    }
}
