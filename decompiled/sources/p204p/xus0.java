package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xus0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266169a;

    /* JADX INFO: renamed from: b */
    public int f266170b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z0s0 f266171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xus0(z0s0 z0s0Var, fbk fbkVar) {
        super(fbkVar);
        this.f266171c = z0s0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266169a = obj;
        this.f266170b |= Integer.MIN_VALUE;
        return this.f266171c.emit(null, this);
    }
}
