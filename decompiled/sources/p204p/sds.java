package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sds extends ibk {

    /* JADX INFO: renamed from: a */
    public wcs f208075a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f208076b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uds f208077c;

    /* JADX INFO: renamed from: d */
    public int f208078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sds(uds udsVar, ibk ibkVar) {
        super(ibkVar);
        this.f208077c = udsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208076b = obj;
        this.f208078d |= Integer.MIN_VALUE;
        return uds.m82853M1(this.f208077c, null, this);
    }
}
