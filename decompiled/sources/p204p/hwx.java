package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hwx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96068a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jwx f96069b;

    /* JADX INFO: renamed from: c */
    public int f96070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwx(jwx jwxVar, ibk ibkVar) {
        super(ibkVar);
        this.f96069b = jwxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96068a = obj;
        this.f96070c |= Integer.MIN_VALUE;
        return this.f96069b.m54485a(null, null, this);
    }
}
