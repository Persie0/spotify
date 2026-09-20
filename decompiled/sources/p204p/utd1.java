package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class utd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233896a;

    /* JADX INFO: renamed from: b */
    public int f233897b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f233898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utd1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f233898c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233896a = obj;
        this.f233897b |= Integer.MIN_VALUE;
        return this.f233898c.emit(null, this);
    }
}
