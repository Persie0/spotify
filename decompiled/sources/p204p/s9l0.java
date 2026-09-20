package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206976a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v9l0 f206977b;

    /* JADX INFO: renamed from: c */
    public int f206978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9l0(v9l0 v9l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f206977b = v9l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206976a = obj;
        this.f206978c |= Integer.MIN_VALUE;
        Object objM84970a = this.f206977b.m84970a(this);
        return objM84970a == yuk.f276404a ? objM84970a : new s6x0(objM84970a);
    }
}
