package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ju90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116056a;

    /* JADX INFO: renamed from: b */
    public int f116057b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f116058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f116058c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116056a = obj;
        this.f116057b |= Integer.MIN_VALUE;
        return this.f116058c.emit(null, this);
    }
}
