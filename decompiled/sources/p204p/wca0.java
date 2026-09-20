package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wca0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f249984a;

    /* JADX INFO: renamed from: b */
    public int f249985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f249986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wca0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f249986c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f249984a = obj;
        this.f249985b |= Integer.MIN_VALUE;
        return this.f249986c.emit(null, this);
    }
}
