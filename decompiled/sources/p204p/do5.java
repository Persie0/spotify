package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class do5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f50945a;

    /* JADX INFO: renamed from: b */
    public int f50946b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bo5 f50947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do5(bo5 bo5Var, fbk fbkVar) {
        super(fbkVar);
        this.f50947c = bo5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50945a = obj;
        this.f50946b |= Integer.MIN_VALUE;
        return this.f50947c.emit(null, this);
    }
}
