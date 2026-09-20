package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o8k0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162825a;

    /* JADX INFO: renamed from: b */
    public int f162826b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f162827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8k0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f162827c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162825a = obj;
        this.f162826b |= Integer.MIN_VALUE;
        return this.f162827c.emit(null, this);
    }
}
