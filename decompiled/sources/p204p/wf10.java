package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wf10 extends ibk {

    /* JADX INFO: renamed from: a */
    public eh00 f250660a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f250661b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xf10 f250662c;

    /* JADX INFO: renamed from: d */
    public int f250663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf10(xf10 xf10Var, ibk ibkVar) {
        super(ibkVar);
        this.f250662c = xf10Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250661b = obj;
        this.f250663d |= Integer.MIN_VALUE;
        return this.f250662c.m90448c(null, this);
    }
}
