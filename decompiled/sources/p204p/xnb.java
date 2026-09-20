package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xnb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f263572a;

    /* JADX INFO: renamed from: b */
    public int f263573b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f263574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnb(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f263574c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f263572a = obj;
        this.f263573b |= Integer.MIN_VALUE;
        return this.f263574c.emit(null, this);
    }
}
