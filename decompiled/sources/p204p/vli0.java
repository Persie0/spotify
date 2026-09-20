package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vli0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242531a;

    /* JADX INFO: renamed from: b */
    public int f242532b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f242533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vli0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f242533c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242531a = obj;
        this.f242532b |= Integer.MIN_VALUE;
        return this.f242533c.emit(null, this);
    }
}
