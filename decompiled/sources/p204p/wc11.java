package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wc11 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f249930a;

    /* JADX INFO: renamed from: b */
    public int f249931b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f249932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc11(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f249932c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f249930a = obj;
        this.f249931b |= Integer.MIN_VALUE;
        return this.f249932c.emit(null, this);
    }
}
