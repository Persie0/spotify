package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t3g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f216774a;

    /* JADX INFO: renamed from: b */
    public boolean f216775b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f216776c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z3g0 f216777d;

    /* JADX INFO: renamed from: e */
    public int f216778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3g0(z3g0 z3g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f216777d = z3g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216776c = obj;
        this.f216778e |= Integer.MIN_VALUE;
        Object objM95276a = this.f216777d.m95276a(null, null, null, false, this);
        return objM95276a == yuk.f276404a ? objM95276a : new s6x0(objM95276a);
    }
}
