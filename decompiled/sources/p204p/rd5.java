package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rd5 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f198033a;

    /* JADX INFO: renamed from: b */
    public qcr f198034b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f198035c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ yd5 f198036d;

    /* JADX INFO: renamed from: e */
    public int f198037e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd5(yd5 yd5Var, ibk ibkVar) {
        super(ibkVar);
        this.f198036d = yd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198035c = obj;
        this.f198037e |= Integer.MIN_VALUE;
        return yd5.m93397c(this.f198036d, this);
    }
}
