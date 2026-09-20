package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class p1q extends ibk {

    /* JADX INFO: renamed from: a */
    public j2k0 f173144a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f173145b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r1q f173146c;

    /* JADX INFO: renamed from: d */
    public int f173147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1q(r1q r1qVar, ibk ibkVar) {
        super(ibkVar);
        this.f173146c = r1qVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173145b = obj;
        this.f173147d |= Integer.MIN_VALUE;
        return this.f173146c.mo36356b(null, this);
    }
}
