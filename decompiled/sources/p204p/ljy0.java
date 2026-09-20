package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ljy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134176a;

    /* JADX INFO: renamed from: b */
    public int f134177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f134178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljy0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f134178c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134176a = obj;
        this.f134177b |= Integer.MIN_VALUE;
        return this.f134178c.emit(null, this);
    }
}
