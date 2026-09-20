package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class atd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19659a;

    /* JADX INFO: renamed from: b */
    public int f19660b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f19661c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atd1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f19661c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19659a = obj;
        this.f19660b |= Integer.MIN_VALUE;
        return this.f19661c.emit(null, this);
    }
}
