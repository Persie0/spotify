package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wj2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f251832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ck2 f251833b;

    /* JADX INFO: renamed from: c */
    public int f251834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj2(ck2 ck2Var, ibk ibkVar) {
        super(ibkVar);
        this.f251833b = ck2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f251832a = obj;
        this.f251834c |= Integer.MIN_VALUE;
        return this.f251833b.m33056M(null, null, this);
    }
}
