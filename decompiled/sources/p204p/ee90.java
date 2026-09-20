package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ee90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58718a;

    /* JADX INFO: renamed from: b */
    public int f58719b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f58720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f58720c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58718a = obj;
        this.f58719b |= Integer.MIN_VALUE;
        return this.f58720c.emit(null, this);
    }
}
