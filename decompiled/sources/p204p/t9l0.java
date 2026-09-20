package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v9l0 f218327b;

    /* JADX INFO: renamed from: c */
    public int f218328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9l0(v9l0 v9l0Var, ibk ibkVar) {
        super(ibkVar);
        this.f218327b = v9l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218326a = obj;
        this.f218328c |= Integer.MIN_VALUE;
        Object objM84971b = this.f218327b.m84971b(this);
        return objM84971b == yuk.f276404a ? objM84971b : new s6x0(objM84971b);
    }
}
