package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cg91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f37605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kg91 f37606b;

    /* JADX INFO: renamed from: c */
    public int f37607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f37606b = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f37605a = obj;
        this.f37607c |= Integer.MIN_VALUE;
        return this.f37606b.m56317g(this);
    }
}
