package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bdd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26083a;

    /* JADX INFO: renamed from: b */
    public int f26084b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f26085c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdd1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f26085c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26083a = obj;
        this.f26084b |= Integer.MIN_VALUE;
        return this.f26085c.emit(null, this);
    }
}
