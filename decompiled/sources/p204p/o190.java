package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o190 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f160660a;

    /* JADX INFO: renamed from: b */
    public int f160661b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f160662c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o190(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f160662c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160660a = obj;
        this.f160661b |= Integer.MIN_VALUE;
        return this.f160662c.emit(null, this);
    }
}
