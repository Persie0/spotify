package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fwc extends ibk {

    /* JADX INFO: renamed from: a */
    public String f74041a;

    /* JADX INFO: renamed from: b */
    public String f74042b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f74043c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hwc f74044d;

    /* JADX INFO: renamed from: e */
    public int f74045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwc(hwc hwcVar, ibk ibkVar) {
        super(ibkVar);
        this.f74044d = hwcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74043c = obj;
        this.f74045e |= Integer.MIN_VALUE;
        return this.f74044d.m48931c(null, null, this);
    }
}
