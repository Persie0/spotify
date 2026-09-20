package p204p;

/* JADX INFO: renamed from: p.fw */
/* JADX INFO: loaded from: classes4.dex */
public final class C1875fw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f73910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1957hw f73911b;

    /* JADX INFO: renamed from: c */
    public int f73912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1875fw(C1957hw c1957hw, ibk ibkVar) {
        super(ibkVar);
        this.f73911b = c1957hw;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f73910a = obj;
        this.f73912c |= Integer.MIN_VALUE;
        return this.f73911b.m48902a(this);
    }
}
