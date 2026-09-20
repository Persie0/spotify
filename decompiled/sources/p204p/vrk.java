package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vrk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f244218a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xrk f244219b;

    /* JADX INFO: renamed from: c */
    public int f244220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrk(xrk xrkVar, ibk ibkVar) {
        super(ibkVar);
        this.f244219b = xrkVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244218a = obj;
        this.f244220c |= Integer.MIN_VALUE;
        return this.f244219b.mo25711a(this);
    }
}
