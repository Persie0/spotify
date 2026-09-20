package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57229a;

    /* JADX INFO: renamed from: b */
    public int f57230b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f57231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f57231c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57229a = obj;
        this.f57230b |= Integer.MIN_VALUE;
        return this.f57231c.emit(null, this);
    }
}
