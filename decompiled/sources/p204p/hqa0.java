package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hqa0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f94079a;

    /* JADX INFO: renamed from: b */
    public int f94080b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f94081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqa0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f94081c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f94079a = obj;
        this.f94080b |= Integer.MIN_VALUE;
        return this.f94081c.emit(null, this);
    }
}
