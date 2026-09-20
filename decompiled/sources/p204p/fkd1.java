package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fkd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70528a;

    /* JADX INFO: renamed from: b */
    public int f70529b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f70530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkd1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f70530c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70528a = obj;
        this.f70529b |= Integer.MIN_VALUE;
        return this.f70530c.emit(null, this);
    }
}
