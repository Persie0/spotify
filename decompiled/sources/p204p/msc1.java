package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class msc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ psc1 f146753b;

    /* JADX INFO: renamed from: c */
    public int f146754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msc1(psc1 psc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f146753b = psc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146752a = obj;
        this.f146754c |= Integer.MIN_VALUE;
        return this.f146753b.m70772a(null, null, this);
    }
}
