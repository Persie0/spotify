package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class b5b0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23543a;

    /* JADX INFO: renamed from: b */
    public int f23544b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f23545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5b0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f23545c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f23543a = obj;
        this.f23544b |= Integer.MIN_VALUE;
        return this.f23545c.emit(null, this);
    }
}
