package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wjz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252068a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hhq f252069b;

    /* JADX INFO: renamed from: c */
    public int f252070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjz(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f252069b = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252068a = obj;
        this.f252070c |= Integer.MIN_VALUE;
        return this.f252069b.emit(null, this);
    }
}
