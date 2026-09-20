package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wdu extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250332a;

    /* JADX INFO: renamed from: b */
    public int f250333b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f250334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdu(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f250334c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250332a = obj;
        this.f250333b |= Integer.MIN_VALUE;
        return this.f250334c.emit(null, this);
    }
}
