package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nu8 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f158527a;

    /* JADX INFO: renamed from: b */
    public int f158528b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f158529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu8(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f158529c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f158527a = obj;
        this.f158528b |= Integer.MIN_VALUE;
        return this.f158529c.emit(null, this);
    }
}
