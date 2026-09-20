package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o7d extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p7d f162516b;

    /* JADX INFO: renamed from: c */
    public int f162517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7d(p7d p7dVar, ibk ibkVar) {
        super(ibkVar);
        this.f162516b = p7dVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162515a = obj;
        this.f162517c |= Integer.MIN_VALUE;
        return this.f162516b.m69254b(null, this);
    }
}
