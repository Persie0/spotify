package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hxp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96261a;

    /* JADX INFO: renamed from: b */
    public int f96262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fxp0 f96263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxp0(fxp0 fxp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f96263c = fxp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96261a = obj;
        this.f96262b |= Integer.MIN_VALUE;
        return this.f96263c.emit(null, this);
    }
}
