package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h2a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f86936a;

    /* JADX INFO: renamed from: b */
    public int f86937b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f86938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2a0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f86938c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86936a = obj;
        this.f86937b |= Integer.MIN_VALUE;
        return this.f86938c.emit(null, this);
    }
}
