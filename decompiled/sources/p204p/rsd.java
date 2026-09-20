package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rsd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202289a;

    /* JADX INFO: renamed from: b */
    public int f202290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ssd f202291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsd(ssd ssdVar, ibk ibkVar) {
        super(ibkVar);
        this.f202291c = ssdVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202289a = obj;
        this.f202290b |= Integer.MIN_VALUE;
        return this.f202291c.mo15629a(null, null, this);
    }
}
