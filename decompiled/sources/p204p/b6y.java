package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b6y extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24070a;

    /* JADX INFO: renamed from: b */
    public int f24071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f24072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6y(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f24072c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24070a = obj;
        this.f24071b |= Integer.MIN_VALUE;
        return this.f24072c.emit(null, this);
    }
}
