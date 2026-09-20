package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tjz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f221037a;

    /* JADX INFO: renamed from: b */
    public int f221038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f221039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f221039c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f221037a = obj;
        this.f221038b |= Integer.MIN_VALUE;
        return this.f221039c.emit(null, this);
    }
}
