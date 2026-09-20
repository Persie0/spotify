package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lj2 extends ibk {

    /* JADX INFO: renamed from: a */
    public hj2 f133937a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f133938b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ck2 f133939c;

    /* JADX INFO: renamed from: d */
    public int f133940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj2(ck2 ck2Var, ibk ibkVar) {
        super(ibkVar);
        this.f133939c = ck2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133938b = obj;
        this.f133940d |= Integer.MIN_VALUE;
        return ck2.m33022d(this.f133939c, null, null, this);
    }
}
