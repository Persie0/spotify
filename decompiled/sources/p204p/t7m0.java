package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t7m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217853a;

    /* JADX INFO: renamed from: b */
    public int f217854b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f217855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f217855c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217853a = obj;
        this.f217854b |= Integer.MIN_VALUE;
        return this.f217855c.emit(null, this);
    }
}
