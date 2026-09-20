package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v2s0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f236719a;

    /* JADX INFO: renamed from: b */
    public int f236720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uc90 f236721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2s0(uc90 uc90Var, fbk fbkVar) {
        super(fbkVar);
        this.f236721c = uc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236719a = obj;
        this.f236720b |= Integer.MIN_VALUE;
        return this.f236721c.emit(null, this);
    }
}
