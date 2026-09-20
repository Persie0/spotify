package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sxf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f214884a;

    /* JADX INFO: renamed from: b */
    public int f214885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f214886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxf0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f214886c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f214884a = obj;
        this.f214885b |= Integer.MIN_VALUE;
        return this.f214886c.emit(null, this);
    }
}
