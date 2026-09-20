package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dwc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53663a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hwc f53664b;

    /* JADX INFO: renamed from: c */
    public int f53665c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwc(hwc hwcVar, ibk ibkVar) {
        super(ibkVar);
        this.f53664b = hwcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53663a = obj;
        this.f53665c |= Integer.MIN_VALUE;
        return this.f53664b.m48929a(this);
    }
}
