package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xlp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263220a;

    /* JADX INFO: renamed from: b */
    public int f263221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f263222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f263222c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263220a = obj;
        this.f263221b |= Integer.MIN_VALUE;
        return this.f263222c.emit(null, this);
    }
}
