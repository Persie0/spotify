package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162832a;

    /* JADX INFO: renamed from: b */
    public int f162833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f162834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f162834c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162832a = obj;
        this.f162833b |= Integer.MIN_VALUE;
        return this.f162834c.emit(null, this);
    }
}
