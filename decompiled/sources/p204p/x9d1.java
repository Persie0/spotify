package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x9d1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f259335a;

    /* JADX INFO: renamed from: b */
    public int f259336b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f259337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9d1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f259337c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f259335a = obj;
        this.f259336b |= Integer.MIN_VALUE;
        return this.f259337c.emit(null, this);
    }
}
