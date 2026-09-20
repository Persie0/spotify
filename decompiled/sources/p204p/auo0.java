package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class auo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19990a;

    /* JADX INFO: renamed from: b */
    public int f19991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f19992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auo0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f19992c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19990a = obj;
        this.f19991b |= Integer.MIN_VALUE;
        return this.f19992c.emit(null, this);
    }
}
