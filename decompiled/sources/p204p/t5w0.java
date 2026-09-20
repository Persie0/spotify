package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t5w0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217378a;

    /* JADX INFO: renamed from: b */
    public int f217379b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f217380c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5w0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f217380c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217378a = obj;
        this.f217379b |= Integer.MIN_VALUE;
        return this.f217380c.emit(null, this);
    }
}
