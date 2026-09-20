package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rw90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f203308a;

    /* JADX INFO: renamed from: b */
    public int f203309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f203310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f203310c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f203308a = obj;
        this.f203309b |= Integer.MIN_VALUE;
        return this.f203310c.emit(null, this);
    }
}
