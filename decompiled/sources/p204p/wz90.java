package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wz90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f256536a;

    /* JADX INFO: renamed from: b */
    public int f256537b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f256538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f256538c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f256536a = obj;
        this.f256537b |= Integer.MIN_VALUE;
        return this.f256538c.emit(null, this);
    }
}
