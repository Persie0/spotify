package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class om81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f166995a;

    /* JADX INFO: renamed from: b */
    public int f166996b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f166997c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om81(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f166997c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f166995a = obj;
        this.f166996b |= Integer.MIN_VALUE;
        return this.f166997c.emit(null, this);
    }
}
