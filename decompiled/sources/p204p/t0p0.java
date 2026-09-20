package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t0p0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f215953a;

    /* JADX INFO: renamed from: b */
    public int f215954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f215955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0p0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f215955c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f215953a = obj;
        this.f215954b |= Integer.MIN_VALUE;
        return this.f215955c.emit(null, this);
    }
}
