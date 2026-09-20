package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ly01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137924a;

    /* JADX INFO: renamed from: b */
    public int f137925b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ my01 f137926c;

    /* JADX INFO: renamed from: d */
    public bqz0 f137927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly01(my01 my01Var, ibk ibkVar) {
        super(ibkVar);
        this.f137926c = my01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137924a = obj;
        this.f137925b |= Integer.MIN_VALUE;
        return this.f137926c.mo15629a(null, null, this);
    }
}
