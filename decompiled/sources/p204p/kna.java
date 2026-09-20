package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kna extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f124364a;

    /* JADX INFO: renamed from: b */
    public int f124365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lna f124366c;

    /* JADX INFO: renamed from: d */
    public bqz0 f124367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kna(lna lnaVar, ibk ibkVar) {
        super(ibkVar);
        this.f124366c = lnaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f124364a = obj;
        this.f124365b |= Integer.MIN_VALUE;
        return this.f124366c.mo15629a(null, null, this);
    }
}
