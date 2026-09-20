package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pl70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ql70 f178657b;

    /* JADX INFO: renamed from: c */
    public int f178658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl70(ql70 ql70Var, ibk ibkVar) {
        super(ibkVar);
        this.f178657b = ql70Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178656a = obj;
        this.f178658c |= Integer.MIN_VALUE;
        ql70.m73163b(this.f178657b, null, this);
        return yuk.f276404a;
    }
}
