package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qz2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f194090a;

    /* JADX INFO: renamed from: b */
    public int f194091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f194092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f194092c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f194090a = obj;
        this.f194091b |= Integer.MIN_VALUE;
        return this.f194092c.emit(null, this);
    }
}
