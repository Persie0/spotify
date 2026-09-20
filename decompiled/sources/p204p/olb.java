package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class olb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f166806a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f166807b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f166808c;

    /* JADX INFO: renamed from: d */
    public int f166809d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f166808c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166807b = obj;
        this.f166809d |= Integer.MIN_VALUE;
        return this.f166808c.m59328c(null, null, this);
    }
}
