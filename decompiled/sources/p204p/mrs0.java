package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mrs0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146598a;

    /* JADX INFO: renamed from: b */
    public int f146599b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f146600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrs0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f146600c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146598a = obj;
        this.f146599b |= Integer.MIN_VALUE;
        return this.f146600c.emit(null, this);
    }
}
