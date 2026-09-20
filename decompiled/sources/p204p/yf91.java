package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yf91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f272184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kg91 f272185b;

    /* JADX INFO: renamed from: c */
    public int f272186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf91(kg91 kg91Var, ibk ibkVar) {
        super(ibkVar);
        this.f272185b = kg91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272184a = obj;
        this.f272186c |= Integer.MIN_VALUE;
        return this.f272185b.m56314c(this);
    }
}
