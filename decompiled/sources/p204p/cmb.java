package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cmb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f39635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lmb f39636b;

    /* JADX INFO: renamed from: c */
    public int f39637c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f39636b = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f39635a = obj;
        this.f39637c |= Integer.MIN_VALUE;
        return this.f39636b.m59343t(null, this);
    }
}
