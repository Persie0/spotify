package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class krq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public mbc1 f125711a;

    /* JADX INFO: renamed from: b */
    public hcc1 f125712b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f125713c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mgq f125714d;

    /* JADX INFO: renamed from: e */
    public int f125715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krq0(mgq mgqVar, ibk ibkVar) {
        super(ibkVar);
        this.f125714d = mgqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125713c = obj;
        this.f125715e |= Integer.MIN_VALUE;
        return this.f125714d.m61729a(null, this);
    }
}
