package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sqv extends ibk {

    /* JADX INFO: renamed from: a */
    public long f213170a;

    /* JADX INFO: renamed from: b */
    public z650 f213171b;

    /* JADX INFO: renamed from: c */
    public boolean f213172c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f213173d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uqv f213174e;

    /* JADX INFO: renamed from: f */
    public int f213175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqv(uqv uqvVar, ibk ibkVar) {
        super(ibkVar);
        this.f213174e = uqvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213173d = obj;
        this.f213175f |= Integer.MIN_VALUE;
        return this.f213174e.m83819e(0L, null, false, this);
    }
}
