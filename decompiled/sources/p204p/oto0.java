package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class oto0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f170048a;

    /* JADX INFO: renamed from: b */
    public int f170049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f170050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oto0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f170050c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170048a = obj;
        this.f170049b |= Integer.MIN_VALUE;
        return this.f170050c.emit(null, this);
    }
}
