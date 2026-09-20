package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jvx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116537a;

    /* JADX INFO: renamed from: b */
    public int f116538b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f116539c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvx(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f116539c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116537a = obj;
        this.f116538b |= Integer.MIN_VALUE;
        return this.f116539c.emit(null, this);
    }
}
