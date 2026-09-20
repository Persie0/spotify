package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i22 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f97692a;

    /* JADX INFO: renamed from: b */
    public int f97693b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f97694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i22(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f97694c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97692a = obj;
        this.f97693b |= Integer.MIN_VALUE;
        return this.f97694c.emit(null, this);
    }
}
