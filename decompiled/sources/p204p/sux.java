package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class sux extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214231a;

    /* JADX INFO: renamed from: b */
    public int f214232b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f214233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sux(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f214233c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214231a = obj;
        this.f214232b |= Integer.MIN_VALUE;
        return this.f214233c.emit(null, this);
    }
}
