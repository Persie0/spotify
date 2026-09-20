package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class orb0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168524a;

    /* JADX INFO: renamed from: b */
    public int f168525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f168526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orb0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f168526c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168524a = obj;
        this.f168525b |= Integer.MIN_VALUE;
        return this.f168526c.emit(null, this);
    }
}
