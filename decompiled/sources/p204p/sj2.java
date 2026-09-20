package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class sj2 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f209738a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f209739b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ck2 f209740c;

    /* JADX INFO: renamed from: d */
    public int f209741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj2(ck2 ck2Var, ibk ibkVar) {
        super(ibkVar);
        this.f209740c = ck2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209739b = obj;
        this.f209741d |= Integer.MIN_VALUE;
        return ck2.m33036r(this.f209740c, this);
    }
}
