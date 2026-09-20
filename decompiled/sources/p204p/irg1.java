package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class irg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f104987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ esg1 f104988b;

    /* JADX INFO: renamed from: c */
    public int f104989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irg1(esg1 esg1Var, ibk ibkVar) {
        super(ibkVar);
        this.f104988b = esg1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f104987a = obj;
        this.f104989c |= Integer.MIN_VALUE;
        return esg1.m39909c(this.f104988b, null, this);
    }
}
