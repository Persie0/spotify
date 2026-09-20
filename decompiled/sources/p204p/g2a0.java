package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g2a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f75872a;

    /* JADX INFO: renamed from: b */
    public int f75873b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f75874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2a0(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f75874c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f75872a = obj;
        this.f75873b |= Integer.MIN_VALUE;
        return this.f75874c.emit(null, this);
    }
}
