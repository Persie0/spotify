package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class die extends ibk {

    /* JADX INFO: renamed from: a */
    public int f49327a;

    /* JADX INFO: renamed from: b */
    public nw80 f49328b;

    /* JADX INFO: renamed from: c */
    public rs50 f49329c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f49330d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ iie f49331e;

    /* JADX INFO: renamed from: f */
    public int f49332f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public die(iie iieVar, ibk ibkVar) {
        super(ibkVar);
        this.f49331e = iieVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49330d = obj;
        this.f49332f |= Integer.MIN_VALUE;
        return this.f49331e.m50708f(0, null, null, this);
    }
}
