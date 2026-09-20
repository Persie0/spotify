package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fmb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f71003a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f71004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f71005c;

    /* JADX INFO: renamed from: d */
    public int f71006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f71005c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f71004b = obj;
        this.f71006d |= Integer.MIN_VALUE;
        return this.f71005c.m59346w(this);
    }
}
