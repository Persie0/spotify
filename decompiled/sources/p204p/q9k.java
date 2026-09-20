package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q9k extends ibk {

    /* JADX INFO: renamed from: a */
    public String f186611a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f186612b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vpj f186613c;

    /* JADX INFO: renamed from: d */
    public int f186614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9k(vpj vpjVar, ibk ibkVar) {
        super(ibkVar);
        this.f186613c = vpjVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f186612b = obj;
        this.f186614d |= Integer.MIN_VALUE;
        return this.f186613c.m86159c(null, this);
    }
}
