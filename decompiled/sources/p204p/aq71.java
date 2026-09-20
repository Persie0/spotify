package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aq71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18129a;

    /* JADX INFO: renamed from: b */
    public int f18130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f18131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq71(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f18131c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f18129a = obj;
        this.f18130b |= Integer.MIN_VALUE;
        return this.f18131c.emit(null, this);
    }
}
