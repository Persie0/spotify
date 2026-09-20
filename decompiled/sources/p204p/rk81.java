package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rk81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200027a;

    /* JADX INFO: renamed from: b */
    public int f200028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f200029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk81(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f200029c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200027a = obj;
        this.f200028b |= Integer.MIN_VALUE;
        return this.f200029c.emit(null, this);
    }
}
