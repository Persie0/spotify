package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class e5b0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56333a;

    /* JADX INFO: renamed from: b */
    public int f56334b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f56335c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5b0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f56335c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56333a = obj;
        this.f56334b |= Integer.MIN_VALUE;
        return this.f56335c.emit(null, this);
    }
}
