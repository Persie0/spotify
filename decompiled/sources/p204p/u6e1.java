package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u6e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227308a;

    /* JADX INFO: renamed from: b */
    public int f227309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f227310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f227310c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227308a = obj;
        this.f227309b |= Integer.MIN_VALUE;
        return this.f227310c.emit(null, this);
    }
}
