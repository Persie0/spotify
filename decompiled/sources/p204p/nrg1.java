package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nrg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public rsg1 f157554a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f157555b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ esg1 f157556c;

    /* JADX INFO: renamed from: d */
    public int f157557d;

    /* JADX INFO: renamed from: e */
    public String f157558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrg1(esg1 esg1Var, ibk ibkVar) {
        super(ibkVar);
        this.f157556c = esg1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157555b = obj;
        this.f157557d |= Integer.MIN_VALUE;
        return esg1.m39908b(this.f157556c, null, null, this);
    }
}
