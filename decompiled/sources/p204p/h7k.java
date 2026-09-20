package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h7k extends ibk {

    /* JADX INFO: renamed from: a */
    public String f88478a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f88479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7k f88480c;

    /* JADX INFO: renamed from: d */
    public int f88481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7k(i7k i7kVar, ibk ibkVar) {
        super(ibkVar);
        this.f88480c = i7kVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88479b = obj;
        this.f88481d |= Integer.MIN_VALUE;
        return this.f88480c.m49870b(null, this);
    }
}
