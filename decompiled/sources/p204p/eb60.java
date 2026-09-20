package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eb60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57837a;

    /* JADX INFO: renamed from: b */
    public int f57838b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f57839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f57839c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57837a = obj;
        this.f57838b |= Integer.MIN_VALUE;
        return this.f57839c.emit(null, this);
    }
}
