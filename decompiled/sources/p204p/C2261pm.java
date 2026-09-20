package p204p;

/* JADX INFO: renamed from: p.pm */
/* JADX INFO: loaded from: classes11.dex */
public final class C2261pm extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f178842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2420tm f178843b;

    /* JADX INFO: renamed from: c */
    public int f178844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261pm(C2420tm c2420tm, ibk ibkVar) {
        super(ibkVar);
        this.f178843b = c2420tm;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f178842a = obj;
        this.f178844c |= Integer.MIN_VALUE;
        return this.f178843b.m81083c(this);
    }
}
