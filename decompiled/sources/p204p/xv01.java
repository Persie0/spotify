package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xv01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266238a;

    /* JADX INFO: renamed from: b */
    public int f266239b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uc90 f266240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv01(uc90 uc90Var, fbk fbkVar) {
        super(fbkVar);
        this.f266240c = uc90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266238a = obj;
        this.f266239b |= Integer.MIN_VALUE;
        return this.f266240c.emit(null, this);
    }
}
