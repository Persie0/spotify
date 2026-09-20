package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qsc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192070a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ssc1 f192071b;

    /* JADX INFO: renamed from: c */
    public int f192072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsc1(ssc1 ssc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f192071b = ssc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192070a = obj;
        this.f192072c |= Integer.MIN_VALUE;
        return this.f192071b.mo34674a(this);
    }
}
