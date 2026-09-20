package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class do31 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50928a;

    /* JADX INFO: renamed from: b */
    public int f50929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bo31 f50930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do31(bo31 bo31Var, fbk fbkVar) {
        super(fbkVar);
        this.f50930c = bo31Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50928a = obj;
        this.f50929b |= Integer.MIN_VALUE;
        return this.f50930c.emit(null, this);
    }
}
