package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ajf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16264a;

    /* JADX INFO: renamed from: b */
    public int f16265b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f16266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f16266c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16264a = obj;
        this.f16265b |= Integer.MIN_VALUE;
        return this.f16266c.emit(null, this);
    }
}
