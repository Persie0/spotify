package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kb60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f121098a;

    /* JADX INFO: renamed from: b */
    public int f121099b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f121100c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb60(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f121100c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f121098a = obj;
        this.f121099b |= Integer.MIN_VALUE;
        return this.f121100c.emit(null, this);
    }
}
