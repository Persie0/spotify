package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rz90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204097a;

    /* JADX INFO: renamed from: b */
    public int f204098b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f204099c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f204099c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204097a = obj;
        this.f204098b |= Integer.MIN_VALUE;
        return this.f204099c.emit(null, this);
    }
}
