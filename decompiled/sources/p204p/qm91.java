package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qm91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f190166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rm91 f190167b;

    /* JADX INFO: renamed from: c */
    public int f190168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm91(rm91 rm91Var, ibk ibkVar) {
        super(ibkVar);
        this.f190167b = rm91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f190166a = obj;
        this.f190168c |= Integer.MIN_VALUE;
        return this.f190167b.mo25862S0(0L, 0L, this);
    }
}
