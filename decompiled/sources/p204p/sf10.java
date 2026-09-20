package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sf10 extends ibk {

    /* JADX INFO: renamed from: a */
    public eh00 f208432a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f208433b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xf10 f208434c;

    /* JADX INFO: renamed from: d */
    public int f208435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf10(xf10 xf10Var, ibk ibkVar) {
        super(ibkVar);
        this.f208434c = xf10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208433b = obj;
        this.f208435d |= Integer.MIN_VALUE;
        return this.f208434c.m90447b(null, this);
    }
}
