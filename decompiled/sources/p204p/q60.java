package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class q60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185634a;

    /* JADX INFO: renamed from: b */
    public int f185635b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f185636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f185636c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185634a = obj;
        this.f185635b |= Integer.MIN_VALUE;
        return this.f185636c.emit(null, this);
    }
}
