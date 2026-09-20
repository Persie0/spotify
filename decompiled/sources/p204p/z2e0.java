package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z2e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278555a;

    /* JADX INFO: renamed from: b */
    public int f278556b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f278557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2e0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f278557c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278555a = obj;
        this.f278556b |= Integer.MIN_VALUE;
        return this.f278557c.emit(null, this);
    }
}
