package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r4a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f195711a;

    /* JADX INFO: renamed from: b */
    public int f195712b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f195713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4a0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f195713c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f195711a = obj;
        this.f195712b |= Integer.MIN_VALUE;
        return this.f195713c.emit(null, this);
    }
}
