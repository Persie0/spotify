package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e0a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54910a;

    /* JADX INFO: renamed from: b */
    public int f54911b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f54912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0a0(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f54912c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54910a = obj;
        this.f54911b |= Integer.MIN_VALUE;
        return this.f54912c.emit(null, this);
    }
}
