package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lc91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f131879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dxq0 f131880b;

    /* JADX INFO: renamed from: c */
    public int f131881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc91(dxq0 dxq0Var, ibk ibkVar) {
        super(ibkVar);
        this.f131880b = dxq0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f131879a = obj;
        this.f131881c |= Integer.MIN_VALUE;
        return this.f131880b.m37272a(null, this);
    }
}
