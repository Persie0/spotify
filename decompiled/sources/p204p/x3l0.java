package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x3l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f257829a;

    /* JADX INFO: renamed from: b */
    public int f257830b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ap0 f257831c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3l0(ap0 ap0Var, fbk fbkVar) {
        super(fbkVar);
        this.f257831c = ap0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257829a = obj;
        this.f257830b |= Integer.MIN_VALUE;
        return this.f257831c.emit(null, this);
    }
}
