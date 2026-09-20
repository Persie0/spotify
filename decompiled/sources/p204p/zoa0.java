package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zoa0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f284740a;

    /* JADX INFO: renamed from: b */
    public int f284741b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f284742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoa0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f284742c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f284740a = obj;
        this.f284741b |= Integer.MIN_VALUE;
        return this.f284742c.emit(null, this);
    }
}
