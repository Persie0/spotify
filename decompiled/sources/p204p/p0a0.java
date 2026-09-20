package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p0a0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f172622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wpx f172623b;

    /* JADX INFO: renamed from: c */
    public int f172624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0a0(wpx wpxVar, ibk ibkVar) {
        super(ibkVar);
        this.f172623b = wpxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f172622a = obj;
        this.f172624c |= Integer.MIN_VALUE;
        return this.f172623b.m88726b(null, this);
    }
}
