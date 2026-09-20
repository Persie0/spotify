package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mer extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142827a;

    /* JADX INFO: renamed from: b */
    public int f142828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ker f142829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mer(ker kerVar, fbk fbkVar) {
        super(fbkVar);
        this.f142829c = kerVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142827a = obj;
        this.f142828b |= Integer.MIN_VALUE;
        return this.f142829c.emit(null, this);
    }
}
