package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class uq2 extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f232906a;

    /* JADX INFO: renamed from: b */
    public boolean f232907b;

    /* JADX INFO: renamed from: c */
    public int f232908c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f232909d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vq2 f232910e;

    /* JADX INFO: renamed from: f */
    public int f232911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq2(vq2 vq2Var, ibk ibkVar) {
        super(ibkVar);
        this.f232910e = vq2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f232909d = obj;
        this.f232911f |= Integer.MIN_VALUE;
        return vq2.m86181a(this.f232910e, null, this);
    }
}
