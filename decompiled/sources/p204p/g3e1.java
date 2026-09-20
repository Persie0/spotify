package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class g3e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f76197a;

    /* JADX INFO: renamed from: b */
    public int f76198b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f76199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f76199c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76197a = obj;
        this.f76198b |= Integer.MIN_VALUE;
        return this.f76199c.emit(null, this);
    }
}
