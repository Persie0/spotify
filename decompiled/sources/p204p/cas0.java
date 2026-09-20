package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cas0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f35924a;

    /* JADX INFO: renamed from: b */
    public int f35925b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f35926c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cas0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f35926c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f35924a = obj;
        this.f35925b |= Integer.MIN_VALUE;
        return this.f35926c.emit(null, this);
    }
}
