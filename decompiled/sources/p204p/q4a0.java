package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q4a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185125a;

    /* JADX INFO: renamed from: b */
    public int f185126b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f185127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4a0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f185127c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185125a = obj;
        this.f185126b |= Integer.MIN_VALUE;
        return this.f185127c.emit(null, this);
    }
}
