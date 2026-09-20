package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gve extends ibk {

    /* JADX INFO: renamed from: a */
    public qve f84731a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f84732b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qve f84733c;

    /* JADX INFO: renamed from: d */
    public int f84734d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gve(qve qveVar, ibk ibkVar) {
        super(ibkVar);
        this.f84733c = qveVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84732b = obj;
        this.f84734d |= Integer.MIN_VALUE;
        return this.f84733c.m73986k(this);
    }
}
