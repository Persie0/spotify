package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class no6 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f156595a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qo6 f156596b;

    /* JADX INFO: renamed from: c */
    public int f156597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no6(qo6 qo6Var, ibk ibkVar) {
        super(ibkVar);
        this.f156596b = qo6Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f156595a = obj;
        this.f156597c |= Integer.MIN_VALUE;
        return this.f156596b.m73365a(null, this);
    }
}
