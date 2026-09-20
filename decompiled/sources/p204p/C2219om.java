package p204p;

/* JADX INFO: renamed from: p.om */
/* JADX INFO: loaded from: classes11.dex */
public final class C2219om extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f166947a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2420tm f166948b;

    /* JADX INFO: renamed from: c */
    public int f166949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2219om(C2420tm c2420tm, ibk ibkVar) {
        super(ibkVar);
        this.f166948b = c2420tm;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166947a = obj;
        this.f166949c |= Integer.MIN_VALUE;
        return C2420tm.m81081a(this.f166948b, this);
    }
}
