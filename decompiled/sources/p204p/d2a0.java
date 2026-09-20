package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class d2a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f44522a;

    /* JADX INFO: renamed from: b */
    public int f44523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f44524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2a0(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f44524c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f44522a = obj;
        this.f44523b |= Integer.MIN_VALUE;
        return this.f44524c.emit(null, this);
    }
}
