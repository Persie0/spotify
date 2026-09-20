package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class buw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f31226a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m610 f31227b;

    /* JADX INFO: renamed from: c */
    public int f31228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buw0(m610 m610Var, ibk ibkVar) {
        super(ibkVar);
        this.f31227b = m610Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31226a = obj;
        this.f31228c |= Integer.MIN_VALUE;
        Object objM60936a = this.f31227b.m60936a(null, null, this);
        return objM60936a == yuk.f276404a ? objM60936a : new cn3((String) objM60936a);
    }
}
