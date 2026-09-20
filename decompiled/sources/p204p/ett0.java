package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ett0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62801a;

    /* JADX INFO: renamed from: b */
    public int f62802b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f62803c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ett0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f62803c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62801a = obj;
        this.f62802b |= Integer.MIN_VALUE;
        return this.f62803c.emit(null, this);
    }
}
