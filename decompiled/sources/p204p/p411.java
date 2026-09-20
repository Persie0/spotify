package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p411 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173780a;

    /* JADX INFO: renamed from: b */
    public int f173781b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f173782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p411(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f173782c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173780a = obj;
        this.f173781b |= Integer.MIN_VALUE;
        return this.f173782c.emit(null, this);
    }
}
