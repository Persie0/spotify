package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ohw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f165555a;

    /* JADX INFO: renamed from: b */
    public int f165556b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f165557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohw0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f165557c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f165555a = obj;
        this.f165556b |= Integer.MIN_VALUE;
        return this.f165557c.emit(null, this);
    }
}
