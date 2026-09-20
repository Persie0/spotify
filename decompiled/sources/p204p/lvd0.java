package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lvd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public svd0 f137282a;

    /* JADX INFO: renamed from: b */
    public String f137283b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f137284c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ svd0 f137285d;

    /* JADX INFO: renamed from: e */
    public int f137286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvd0(svd0 svd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f137285d = svd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137284c = obj;
        this.f137286e |= Integer.MIN_VALUE;
        return this.f137285d.m79436n(null, this);
    }
}
