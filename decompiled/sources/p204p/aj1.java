package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class aj1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16130a;

    /* JADX INFO: renamed from: b */
    public int f16131b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f16132c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj1(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f16132c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16130a = obj;
        this.f16131b |= Integer.MIN_VALUE;
        return this.f16132c.emit(null, this);
    }
}
