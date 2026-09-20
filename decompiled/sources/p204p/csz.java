package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class csz extends ibk {

    /* JADX INFO: renamed from: a */
    public String f41719a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f41720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dsz f41721c;

    /* JADX INFO: renamed from: d */
    public int f41722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csz(dsz dszVar, ibk ibkVar) {
        super(ibkVar);
        this.f41721c = dszVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f41720b = obj;
        this.f41722d |= Integer.MIN_VALUE;
        return this.f41721c.m36791c(null, null, this);
    }
}
