package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class j9e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f110156a;

    /* JADX INFO: renamed from: b */
    public int f110157b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f110158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f110158c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110156a = obj;
        this.f110157b |= Integer.MIN_VALUE;
        return this.f110158c.emit(null, this);
    }
}
