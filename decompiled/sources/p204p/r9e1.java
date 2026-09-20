package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r9e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197040a;

    /* JADX INFO: renamed from: b */
    public int f197041b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f197042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f197042c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197040a = obj;
        this.f197041b |= Integer.MIN_VALUE;
        return this.f197042c.emit(null, this);
    }
}
