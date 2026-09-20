package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class iwx extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f106525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jwx f106526b;

    /* JADX INFO: renamed from: c */
    public int f106527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwx(jwx jwxVar, ibk ibkVar) {
        super(ibkVar);
        this.f106526b = jwxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f106525a = obj;
        this.f106527c |= Integer.MIN_VALUE;
        return this.f106526b.m54486b(this);
    }
}
