package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bg91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kg91 f26891b;

    /* JADX INFO: renamed from: c */
    public int f26892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f26891b = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26890a = obj;
        this.f26892c |= Integer.MIN_VALUE;
        return this.f26891b.m56316f(this);
    }
}
