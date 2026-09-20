package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iu90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105894a;

    /* JADX INFO: renamed from: b */
    public int f105895b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f105896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f105896c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105894a = obj;
        this.f105895b |= Integer.MIN_VALUE;
        return this.f105896c.emit(null, this);
    }
}
