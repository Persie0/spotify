package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wjz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252071a;

    /* JADX INFO: renamed from: b */
    public int f252072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f252073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f252073c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252071a = obj;
        this.f252072b |= Integer.MIN_VALUE;
        return this.f252073c.emit(null, this);
    }
}
