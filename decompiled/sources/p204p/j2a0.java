package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j2a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107988a;

    /* JADX INFO: renamed from: b */
    public int f107989b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f107990c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2a0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f107990c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107988a = obj;
        this.f107989b |= Integer.MIN_VALUE;
        return this.f107990c.emit(null, this);
    }
}
