package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class owx0 extends ibk {

    /* JADX INFO: renamed from: a */
    public Object f170798a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f170799b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pwx0 f170800c;

    /* JADX INFO: renamed from: d */
    public int f170801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owx0(pwx0 pwx0Var, fbk fbkVar) {
        super(fbkVar);
        this.f170800c = pwx0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f170799b = obj;
        this.f170801d |= Integer.MIN_VALUE;
        return this.f170800c.mo30229d(null, this);
    }
}
